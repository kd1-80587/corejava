package que1;
/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14*/
import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  int num;
	  System.out.print("enter the no to convert=");
	 num=sc.nextInt();
	 
	 System.out.println("GIVEN NO IS="+num);
	 System.out.println("GIVEN NO IN BINARY="+Integer.toBinaryString(num));
	 System.out.println("GIVEN NO IN OCTAL="+Integer.toOctalString(num));
	 System.out.println("GIVEN NO IN HEXADECIMAL=10"+Integer.toHexString(num));
     System.out.println();
      
	}

}
