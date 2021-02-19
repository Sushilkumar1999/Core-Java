package test2;

import java.util.Scanner;

public class Areaoftrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the trangle:");
		double b = sc.nextDouble();
		System.out.println("Enter the height of the trangle:");
		double h = sc.nextDouble();
	    double area = 0.5 *b*h;
	    System.out.println("Area of the trangle is :" +area);
	}

}
