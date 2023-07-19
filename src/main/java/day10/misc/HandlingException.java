package day10.misc;


class Divider{
	
		public static void math(int a, int b)throws IllegalArgumentException{
	   		if(b==0) {
	   			throw new IllegalArgumentException("Its not valid");
	   		}
	   		
	   		int c = a/b;
	   		System.out.println(c);
	   	}
		
}


public class HandlingException {
	public static void main(String[] args) throws Exception {
		
		try {
			Divider.math(10, 0);
   		}
		
   		catch(IllegalArgumentException e) {
   			System.out.println(e.getMessage());
   			e.printStackTrace();
   		}
   	
	}

}
