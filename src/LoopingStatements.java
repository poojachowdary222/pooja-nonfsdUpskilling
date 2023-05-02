import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		   int a;

		     System.out.print("Please enter number: ");

		     a = sc.nextInt();

		     for(int i= 1; i <= a; i++)

		     {

		         if(i >= 100)

		         {
		        	 break;
		         }
		        	 

		            if(i%10 == 0)

		            {

		                    continue;

		            }

		           
		                System.out.println(i);

		            }

		         }

		         

		      
	
		  
	}
