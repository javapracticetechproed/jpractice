package day_02;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		/*
		 * Print “Please enter your job title” create a String variable named “jobTitle”
		 * and get the data from the user Use the below test data to print the correct
		 * jobTitle. Example : if jobTitle is qa then print “Your job title is Quality
		 * Analyst” test data: qa then print Quality Analyst dev then print Developer ba
		 * then print Business Analyst pm then print Project Manager
		 */

		// creating the scanner object
		Scanner input = new Scanner(System.in);
		// giving message to the user
		System.out.println("Please enter your job title");
		// getting string input from user
		String jobTitle = input.next();

		// creating variables for different job titles
		String qa = "Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";

		// If statement => if is used to check certain condition, comparison

		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Your job title is " + qa);
		} else if (jobTitle.toLowerCase().equals("dev")) {// DEV=>dev
			System.out.println("Your job title is " + dev);
		} else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("Your job title is " + ba);
		} else if (jobTitle.toLowerCase().equals("pm")) {
			System.out.println("Your job title is " + pm);
		} else {
			System.out.println("Heyy " + jobTitle + " is not Valid. Try Again!");
		}
		input.close();
	}

}
