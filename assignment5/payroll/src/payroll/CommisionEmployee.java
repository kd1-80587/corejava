package payroll;

import java.util.Scanner;

public class CommisionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommisionEmployee() {
		super();

	}

	public CommisionEmployee(String firstName, String lastName, String socialSecurityNUmber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNUmber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the gross sale employee=");
		this.grossSales = sc.nextDouble();
		System.out.print("enter the gross comission rate employee=");
		this.commissionRate = sc.nextDouble();

	
	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", "
				+ super.toString() + "]";
	}

	@Override
	public void calculateSalary() {
		System.out.println("Total salary="+(this.commissionRate*this.grossSales));

	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}
	

}
