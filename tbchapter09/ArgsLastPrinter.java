package hello;

public class ArgsLastPrinter {

	public static void main(String[] args) {

		/*課題：コマンドライン引数の最後の引数を出力するプログラムを作成。
		引数が渡されなかった場合、「なし」と出力。*/

		if (args.length == 0) {
			System.out.println("なし");
		} else {
			System.out.println(args[args.length - 1]);
		}

	}
}
