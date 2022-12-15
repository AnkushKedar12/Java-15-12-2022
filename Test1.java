// Taking pin from the user  and checking if it correct or not.



package prouduct;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int pass = 123;
		int n;
		int count =0;
		
		  
	     for (int i=0;i<=3 ;i++)
	    	 
	     {  
	    	 System.out.println("Enter the Passwrod");
		     n = scan.nextInt();
	    	 if(n==pass)
	    	 {
	    		 System.out.println("Correct Welcome"); 
	    		 
	    		 break;
	    		 
	    	 }
	    	 
	    	 if(n!=pass )
	    	 { System.out.println("InCorrect password"); 
	    	   count++;
	    	 }
	    	   
	    	 if(count==3)
	    	 {System.out.println(" Limit Exceeded  Locked out"); 
	    	 break;}
	    	 
	    	 
	     }
	     
	    
	     scan.close();
		

	}
}

