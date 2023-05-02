package nonfsdpractice;

		import java.util.Scanner;

		public class Fibonacci {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int n = scanner.nextInt();

		        int first = 0, second = 1;
		        System.out.print(first + " " + second);

		        while (second <= n) {
		            int sum = first + second;
		            System.out.print(" " + sum);
		            first = second;
		            second = sum;
		        }
		    }
		}

	
