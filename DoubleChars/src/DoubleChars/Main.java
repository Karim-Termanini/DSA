package DoubleChars;

public class Main {

	public static void main(String[] args) {
		System.out.println(DoubleChars("Karim"));
	}

	public static String DoubleChars(String s) {
		String sum = "";
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) + "" + s.charAt(i);
		}
		return sum;
	}
}
