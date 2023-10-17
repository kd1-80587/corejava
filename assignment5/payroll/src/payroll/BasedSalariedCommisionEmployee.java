package payroll;


import java.util.Scanner;

public class BasedSalariedCommisionEmployee extends CommisionEmployee {
	private double baseSalary;

	public BasedSalariedCommisionEmployee() {
		super();
	}

	public BasedSalariedCommisionEmployee(String firstName, String lastName, String socialSecurityNUmber,
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNUmber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the basic salary of employee =");
		this.baseSalary=sc.nextDouble();
	
	}

	

	@Override
	public String toString() {
		return "BasedSalariedCommisionEmployee [baseSalary=" + baseSalary + "," + super.toString()
				+ "]";
	}

	@Override
	public void calculateSalary() {
		
	System.out.println("Total salary="+((this.getCommissionRate()*this.getGrossSales())+this.baseSalary));
	}
	public void increament() 
	{
		System.out.println("salary after increment="+((this.getCommissionRate()*this.getGrossSales())+this.baseSalary)*1.1);	
	}
	


	}
