package sortingThreeInteger;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Three Integers: ");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int num3 = in.nextInt();

			if (num1 > num2) {
				final int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			if (num2 > num3) {
				final int temp = num2;
				num2 = num3;
				num3 = temp;
			}
			if (num1 > num2) {
				final int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.println("The Sorted Numbers are " + num1 + " " + num2 + " " + num3);
		}
	}

}
