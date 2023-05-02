import java.util.Scanner;

public class GradingApplication {
public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your marks");

	float marks = scan.nextFloat();

	if(marks>35) {

	if(marks<=59) {

	System.out.println("Grade C");

	}

	else if(marks<=69) {

	System.out.println("Grade B");

	}

	else if(marks>=70) {

	System.out.println("Grade A");

	    }

	}

	else {
		
	System.out.println("Failed");

	     }	
	
}
}
