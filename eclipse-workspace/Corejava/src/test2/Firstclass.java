package test2;

import Test3.Thirdclass;

public class Firstclass {
	
	int age;
	String name;
	float salary;
	
	public void Display() {
		System.out.println("Inside display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondclass obj1 = new Secondclass();
		obj1.show("Sushil");
		obj1.calculate();
		Secondclass obj2 = new Secondclass();
		obj2.show("kumar");
		obj2.calculate();
		Thirdclass obj3 = new Thirdclass();
		obj3.calculate();

	}

}
