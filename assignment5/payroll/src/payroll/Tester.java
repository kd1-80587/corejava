package payroll;

import java.util.Scanner;

public class Tester {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add salaried employee ");
		System.out.println("2.Add hourly based employee ");
		System.out.println("3.Add commission based employee ");
		System.out.println("4.Add base-salried plus commision employee ");
		System.out.println("5.Display all employee and total salary of salaried employee ");
		System.out.println("6.To give reward to salaried plus commission based employee hike 0f 10%");
		System.out.println("------------ENTER YOUR CHOICE---------------");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int size;
		int index=0;
		System.out.print("enter the size of array=");
		size = sc.nextInt();
		Employee[] employee = new Employee[size];
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				employee[index] = new SalariedEmployee();
				System.out.println("-----------------------------------------");
				if(size>index)
					employee[index].accept(sc);
					else
						System.out.println("array is full.......................");			
				System.out.println("--------successfully add---------------------------------");
				System.out.println("Information=" + employee[index].toString());
				employee[index].calculateSalary();
				System.out.println("-----------------------------------------");
				index++;

				break;
			case 2:
				employee[index] = new HourlyEmployee();
				System.out.println("-----------------------------------------");
				if(size>index)
					employee[index].accept(sc);
					else
						System.out.println("array is full.......................");			
				System.out.println("--------successfully add---------------------------------");
				System.out.println("Information=" + employee[index].toString());
				employee[index].calculateSalary();
				System.out.println("-----------------------------------------");
				index++;

				break;
			case 3:
				employee[index] = new CommisionEmployee();
				System.out.println("-----------------------------------------");
				if(size>index)
					employee[index].accept(sc);
					else
						System.out.println("array is full.......................");
				System.out.println("--------successfully add---------------------------------");
				System.out.println("Information=" + employee[index].toString());
				employee[index].calculateSalary();
				System.out.println("-----------------------------------------");
				index++;

				break;
			case 4:
				employee[index] = new BasedSalariedCommisionEmployee();
				System.out.println("-----------------------------------------");
				if(size>index)
				employee[index].accept(sc);
				else
					System.out.println("array is full.......................");
				System.out.println("--------successfully add---------------------------------");
				System.out.println("Information=" + employee[index].toString());
				employee[index].calculateSalary();
				System.out.println("-----------------------------------------");
				index++;

				break;
			case 5:
				System.out.println("-----------------------------------------");
				for (int i=0;i<index;i++) {
				System.out.println(employee[i].toString());
				employee[i].calculateSalary();
				}
				System.out.println("-----------------------------------------");

				break;
			case 6: 
				  BasedSalariedCommisionEmployee bsc=new BasedSalariedCommisionEmployee();
				  bsc.accept(sc);
				  bsc.increament();
				break;
			
			}
		}
	}

}
