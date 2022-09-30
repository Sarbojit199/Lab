package Array;

import java.util.Scanner;

class customer {
	private int accNo;
	private String accName;
	private double accBal;
	private double amnt;

	public void createAccount(int accNum, String accNam, double accBall) {
		accNo = accNum;
		accName = accNam;
		accBal = accBall;
	}

	public void setAmnt(double amount) {
		accBal += amount;
	}

	public void getAmount() {
		System.out.println("Account holder  " + accName);
		System.out.println("Account balance  " + accBal);

	}

	public void withdrew(double amount) {
		accBal -= amount;
		System.out.println("withdraw of INR " + amount + " successful. \nYour updated balance is " + accBal);
	}
}

public class banking {

	public static void main(String[] args) {
	customer sarbo =new customer();
	sarbo.createAccount(234, "sarbojit", 1000.0);
	sarbo.setAmnt(500.0);
	sarbo.getAmount();	//callling getamount method
	sarbo.withdrew(200.0);
	customer arijit=new customer();
	
	
	arijit.createAccount(250, "arijit", 2000.0);

	arijit.setAmnt(500.0);
	
	arijit.getAmount();
	arijit.withdrew(300.0);
	
	
	}
	/*
	 * output
	 *  Account holder sarbojit 
	 *  Account balance 1500.0 
	 *  withdraw of INR 200.0
	 * successful. 
	 * Your updated balance is 1300.0 
	 * Account holder arijit
	 *  Account balance 2500.0 
	 * withdraw of INR 300.0 successful. 
	 * Your updated balance is 2200.0
	 */
	
}
