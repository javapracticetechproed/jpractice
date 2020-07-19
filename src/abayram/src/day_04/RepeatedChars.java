package day_04;

import java.util.Scanner;

public class RepeatedChars {

	public static void main(String[] args) {
		/*
		ask user to enter a name and a character, 
		then check how many times the character is repeated 
		in the name using loops in the name
		e.g:
		char ch1= 'a' ;
		String name =“John came late" => number of a = 2 
		*/
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a string");
			String str=scan.nextLine();
			
			System.out.println("Please enter a char");
			char ch=scan.next().charAt(0);
			int counter=0;
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i)==ch) {
					counter++;
				}
			}
			System.out.println("number of "+ch+" = "+counter);
			
			scan.close();
	}

}
