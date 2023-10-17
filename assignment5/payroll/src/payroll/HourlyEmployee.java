package payroll;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hour;

	public HourlyEmployee() {
		super();
	}

	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNUmber, double wage, double hour) {
		super(firstName, lastName, socialSecurityNUmber);
		this.wage = wage;
		this.hour = hour;
	}


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the employee hourly wage=");
		this.wage = sc.nextDouble();
		System.out.print("enter the employee work hours=");
		this.hour = sc.nextDouble();

	
	}

	@Override
	public void calculateSalary() {
        if(this.hour<=40)
        	System.out.println("Total salary="+this.wage*this.hour);
        else if(this.hour>40) 
        {
          System.out.println("Total salary="+(40*wage+((this.hour-40)*this.wage*1.5)));	
        }
	}


	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hour=" + hour + ", toString()=" + super.toString() + "]";
	}       

	

}
