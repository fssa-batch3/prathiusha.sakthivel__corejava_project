package day11.misc;

public class ThrowAndThrows {

//	public static boolean divide(int a, int b) {
//		try {
//			int c = a/b;
//			return true;
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		return true;
//	}

//	public static boolean divide(int a, int b){
//		try {
//			int c = a / b;
//			return true;
//		} catch (ArithmeticException e) {
//			throw e;
//		}
//
//	}


	public static boolean divide(int a, int b) throws Exception {
		if(b ==0) {
			throw new IllegalArgumentException("zero va kudukaatha da");
		}
		return true;
	}

	
	
	
	public static void main(String[] args) {

		
			try {
				divide(10, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		

	}

}