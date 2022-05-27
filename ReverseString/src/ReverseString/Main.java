package ReverseString;

public class Main {

	public static void main(String[] args) {
		System.out.println(ReverseString("Karim"));
	}

	public static String ReverseString(String text) {
		String sum = "";
		for (int i = 0; i < text.length(); i++) {
			sum = text.charAt(i) + sum;
		}
		return sum;
	}

}
