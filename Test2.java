//Accept a no from User and find no of its digits

package prouduct;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int count=0;
		
		System.out.println("Enter the Value");
		num= scan.nextInt();
		
		while(num>0)
		{ 
			num=num/10;
			count++;
		}
		
		System.out.println( "No of Digits are :"+count);
		
		scan.close();
		 

	}

}
