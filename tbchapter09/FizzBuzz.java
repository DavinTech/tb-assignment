package hello;

public class FizzBuzz {

	public static void main(String[] args) {
		int i;
		if (args.length == 1) {

			int input = Integer.parseInt(args[0]);

			for (i = 1; i <= input; i++) {
				if (i % 3 == 0 && i % 5 != 0) {
					System.out.print("Fizz ");
				} else if (i % 3 != 0 && i % 5 == 0) {
					System.out.print("Buzz ");
				} else if (i % 3 == 0 && i % 5 == 0) {
					System.out.print("FizzBuzz ");
				} else {
					System.out.print(i + " ");
				}
			}

		}
	}
}
