package test2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n= 14;
      for(int i=2;i<=n/2;i++) {
    	  if(n%i == 0) {
    		  System.out.println("not a prime");
    		   break;
    	  }
    	  else {
    		  System.out.println("is a prime");
    		  break;
    	  }
      }
	}

}
