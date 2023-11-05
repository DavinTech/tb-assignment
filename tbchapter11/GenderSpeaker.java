package hello.tbchapter11;

public class GenderSpeaker {

	private static void doSpeak(AbstractPerson person) {
		person.speak();
	}

	public static void main(String[] args) {

		doSpeak(new Man());
		doSpeak(new Woman());

	}

}
