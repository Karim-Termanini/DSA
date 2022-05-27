package area_of_circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: ");
		double radius = in.nextDouble();
		in.close();
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle is: " + area);
	}

}
