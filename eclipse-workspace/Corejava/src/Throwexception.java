package test2;

public class Throwexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int age = 11;
		if(age < 18) {
			throw new ArithmeticException("Not valid");
		}
		else {
			System.out.println("valid");
		}
		}
		catch (ArithmeticException e) {
			System.out.println("Exception handeled");
		}
	}

}
