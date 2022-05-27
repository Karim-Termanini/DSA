package countWords;

public class Main {

	public static void main(String[] args) {
		String text = "Programming is easy to learn.";
		System.out.println(CountWords(text));
	}

	public static int CountWords(String text) {
		int counter = 0;
		if (text == null || text.isEmpty()) {
			return 0;
		}
		counter = text.split(" ").length;
		return counter;
	}
}
