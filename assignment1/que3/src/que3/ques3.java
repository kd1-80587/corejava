package que3;

import java.util.Scanner;

/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.*/
public class ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int a=1;
		int total = 0;
		do {
		System.out.println("------------------------MENU------------------");
	 
		System.out.println("1.IDLI PRICE=50");
		System.out.println("2.WADA PRICE=60");
		System.out.println("3.DOSA PRICE=55");
		System.out.println("4.UPMA PRICE=65");
		System.out.println("5.PLAIN DOSA PRICE=70");
		System.out.println("6.MASALA DOSA PRICE=80");
		System.out.println("7.SPOUNG DOSA PRICE=60");
		System.out.println("8.MAISOOR DOSA PRICE=70");
		System.out.println("9.CUT DOSA PRICE=80");
		System.out.println("10.SAMOSA PRICE=40");
		System.out.println("11.GENERATE TOTAL BILL AND EXIT");
		System.out.println("ENTER YOUR CHOICE=");
		
		
			
			choice = sc.nextInt();
			switch (choice) {
			case 1:
			    System.out.println("enter the quantity");
				a= sc.nextInt();
				System.out.println("-----------------------you order idli");
				total = total + 50*a;
				break;
			case 2:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				System.out.println("------------------------you order wada");
				total = total + 60*a;
				break;
			case 3:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				System.out.println("-------------------------you order dosa");
				total = total + 55*a;
				break;
			case 4:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				//System.out.println("-------------------------you order upma");
				total = total + 65*a;
				break;
			case 5:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				//System.out.println("---------------------you order plane dosa ");
				total = total + 70*a;
				break;
			case 6:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				//System.out.println("-------------------------you order masal dosa");
				total = total + 80*a;
				break;
			case 7:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				System.out.println("you order spoung dosa");
				total = total + 60*a;
				break;
			case 8:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				//System.out.println("-----------------------------you order maisoor dosa");
				total = total + 70*a;
				break;
			case 9:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				//System.out.println("-----------------------------you order cut dosa");
				total = total + 80*a;
				break;
			case 10:
				System.out.println("enter the quantity");
				a= sc.nextInt();
				System.out.println("----------------------------you order samosa");
				total = total + 40*a;
				break;
			case 11:
				System.out.println("**********************************************************");
				System.out.println("TOTAL BILL=" + total);
				System.out.println("--------:-) Thank you visit again :-)-----------");
				System.out.println("**********************************************************");
				System.exit(0);
				break;

			default:
				System.out.println("--------invalid choice-------------------------");
				
			}
		}	while(choice!= 0);

	}

}
