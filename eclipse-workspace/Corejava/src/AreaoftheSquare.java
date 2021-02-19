package test2;

import java.util.Scanner;

public class AreaoftheSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		double b = sc.nextDouble();
      	double area = b*b;
      	System.out.println("Area of the square is :"+area);
	}

}
