package que2;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	Scanner sc=new Scanner(System.in);
	
	public Employee(String firstName, String lastName, double monthlySalary) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public Employee() 
	{
		this.firstName = "";
		this.lastName ="";
		this.monthlySalary = 0;	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	void accept() 
	{
     System.out.print("enter the first name of employee=");
     firstName=sc.next();
     System.out.print("enter the last name of employee=");
     lastName=sc.next();
     System.out.print("enter the monthly salary of employee=");
     monthlySalary=sc.nextInt();
     if(monthlySalary>0)
     { 
     }else {
    	 System.out.println("please enter valid salary.....");	
     }
	}
	void display()
	{
	  System.out.println("first name of employee="+firstName);	
	  System.out.println("first name of employee="+lastName);	
	  System.out.println("first name of employee="+monthlySalary);	
	}
	double calculateYearlySalary() 
	{
	return monthlySalary*12;	
	}
	double calculateRaise() 
	{
	return monthlySalary*12+(((monthlySalary*12)/100)*10);	
	}
	
	

}
