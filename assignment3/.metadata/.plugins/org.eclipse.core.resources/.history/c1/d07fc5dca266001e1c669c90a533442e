package que1;

import java.util.Scanner;

public class CreditLimit {
	private int accountNumber;
	private int beginnigBalance;
	private int charges;
	private int credit;
	private int newBalance;
	private int creditLimit;
	
	Scanner sc=new Scanner(System.in);
	
	public CreditLimit(int accountNumber, int beginnigBalance, int charges, int credit, int newBalance) {
		this.accountNumber = accountNumber;
		this.beginnigBalance = beginnigBalance;
		this.charges = charges;
		this.credit = credit;
		this.newBalance = newBalance;
	}


	public CreditLimit() {
		this.accountNumber = 0;
		this.beginnigBalance = 0;
		this.charges = 0;
		this.credit = 0;
		this.newBalance = 0;
		this.creditLimit=20000;
	}


	void accept() 
	{
	  System.out.println("enter the account number=");
	 this.accountNumber=sc.nextInt();

	  System.out.println("enter the begining balance=");
	  this.beginnigBalance=sc.nextInt();

	  System.out.println("enter the charges=");
	  this.charges=sc.nextInt();
	  
	  System.out.println("enter the credit =");
	  this.credit=sc.nextInt();
	}
	public void newBalance() 
	{
		int newBalance=this.beginnigBalance+this.charges-this.credit;
		if(newBalance<=creditLimit)
			System.out.println("new balance ="+newBalance);
		else
         System.out.println("Credit Limit Exceed");
	}
	

}
	

	
	
	
	
	


