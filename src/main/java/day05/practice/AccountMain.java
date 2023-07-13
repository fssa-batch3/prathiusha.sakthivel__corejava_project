package day05.practice;

public class AccountMain {

	public static void main(String[] args) {
		
		Account myAcc = new Account("5000 1000 2000 4000", 10000.00);
		
		
		AxisBankATM myAxisAcc= new AxisBankATM();
		
		myAxisAcc.deposit(myAcc, 1000.0);
		
		try {
			myAxisAcc.withdraw(myAcc, 2000.0);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(myAcc.getAccNo());
		System.out.println(myAcc.getBalance());
	}

}
