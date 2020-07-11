package jpractice;

import java.util.Scanner;

public class change_hotmail_to_gmail {

	public static void main(String[] args) {
		/* ask user to enter an e-mail adress then if it contains "hotmail" replace it with "gmail"
		 * e.g : mesutyaman@hotmail.com => mesutyaman@gmail.com
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your email adress");
		String email = sc.next();
		
		String updatedEmail = email.replace("hot","g");
		System.out.println(updatedEmail);
		
		
		int endPoint = email.indexOf("@")+1;
		int startPoint = email.indexOf(".");
		
		System.out.println(email.substring(0,endPoint)+"gmail"+email.substring(startPoint));
		
		
	}

}
