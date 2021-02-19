package test2;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		int i = 0;
		int j = 10/i;
		System.out.println("hii sushil");

	}catch(ArithmeticException e) {
		System.out.println("we can`t divide by zero");
	}catch(Exception e) {
		System.out.println("Exception occured");
	}
	System.out.println("Hii kumar");
	
	}

}
