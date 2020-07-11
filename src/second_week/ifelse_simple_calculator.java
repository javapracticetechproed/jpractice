package second_week;

import java.util.Scanner;

public class ifelse_simple_calculator {

	public static void main(String[] args) {
		/*
		 * ask user to enter 2 int numbers then ask user to enter which operator they
		 * want to use if addition then print here is the sum of your
		 * 
		 * operation 7+4 = 11
		 * Addition
		 * Subtraction
		 * Division
		 * Multiplication
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your operation and 2 numbers : ");
		String operation = scan.next();
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(operation.equalsIgnoreCase("Addition")){
			System.out.println("here is the sum of your "+operation+" " +(n1 + n2));
		}else if(operation.equalsIgnoreCase("Suctraction")) {
			System.out.println("here is the sum of your "+operation+" " +(n1 - n2));
		}else if(operation.equalsIgnoreCase("Division")) {
			System.out.println("here is the sum of your "+operation+" " +(n1 / n2));
		}else if(operation.equalsIgnoreCase("Multiplication")) {
			System.out.println("here is the sum of your "+operation+" " +(n1 * n2));

		}else {
			System.out.println("You might have typed a wring operation");
		}
		

	}

}
