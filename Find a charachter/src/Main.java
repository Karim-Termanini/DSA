import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String text;
		char ch;
		try (Scanner in = new Scanner(System.in)) {
			text = in.next();
			ch = in.next().charAt(0);
		}
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				System.out.println(ch + " found at index: " + i);
			}
		}

	}

}
