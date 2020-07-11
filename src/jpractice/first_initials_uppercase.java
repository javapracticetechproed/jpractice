package jpractice;

import java.util.Scanner;

public class first_initials_uppercase {

	public static void main(String[] args) {
		/* ask user to enter firstName and lastName then make first initials uppercase and rest should be
		 * all lovercase
		 * 
		 * ferhat => Ferhat
		 * kirac => Kirac
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type you first and last name");
		String firstName = scan.next();
		String lastName = scan.next();
		
		System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
		System.out.println(lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
		
		

	}

}
