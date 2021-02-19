package test2;

import java.io.IOException;

public class Throwsexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsexception obj = new Throwsexception();
		try {
			obj.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		    System.out.println("Exception Occured");
		}
	}
	
	public void m1() throws IOException {
		int age = 11;
		if(age < 18) {
			throw new IOException("Not valid");
		}
		else {
			System.out.println("valid");
		}
		}
	}


