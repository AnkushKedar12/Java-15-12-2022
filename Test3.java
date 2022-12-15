/*	Write a program WhileLoop.java that uses while loop to perform the following steps:
 * 
1.	Prompttheusertoinputtwopositiveintegers:firstNumandsecondNum(firstNummustbesmaller
2.	thansecondNum).
1.	Prompt the user to input two positive integers: firstNum and secondNum (firstNum must be smaller than secondNum).
2.	Output all the even numbers between firstNum and secondNum inclusive.
3.	Output the sum of all the even numbers between firstNum and secondNum inclusive.
4.	Output all the odd numbers between firstNum and secondNum inclusive.
5.	Output the sum of all the odd numbers between firstNum and secondNum inclusive*/


package prouduct;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int n1,n2;
		int esum=0;
		int osum=0;
		int sum=0;
		
		
		System.out.println(" \nfirst no");
		n1=scan.nextInt();
		System.out.println("\nSecond no");
		n2=scan.nextInt();
		
		while(n1<=n2)
		{
			if(n1%2==0)
			{
				esum=esum+n1;
				n1++;
			}
			else
			{ 
				osum=osum+n1;
				
				n1++;
			}
			
		}
		
		
		sum=esum+osum;
		
		System.out.println("\nSum of all even no btw First and Second no "+esum);
		System.out.println("\nSum of all odd no btw First and Second no"+osum);
		System.out.println("\nTotal sum of even and odd no" +sum);
		
		scan.close();

	}

}
