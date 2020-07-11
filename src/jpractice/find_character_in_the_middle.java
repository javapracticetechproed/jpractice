package jpractice;

import java.util.Scanner;

public class find_character_in_the_middle {

	public static void main(String[] args) {
		/* 1. Ask user to enter a word. If the word has odd number of characters
		 * and has 3 or more characters, print the character in the middle of the word.
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		boolean isTrue = word.length() % 2 == 1 && word.length() >= 3;
		
		char ch1;
		String name;
		
		if(isTrue) {
			ch1 = word.charAt(word.length() / 2);
			System.out.println(ch1);
		}else {
			System.out.println("It has not odd number of characters");
		}
		

	}

}
