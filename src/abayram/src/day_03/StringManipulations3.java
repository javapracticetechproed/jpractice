package day_03;

import java.util.Scanner;

public class StringManipulations3 {

	public static void main(String[] args) {
		//Create a string : name and assign a 3 word sentences
		//if name is one or two words print “enter 3 words sentences”
		//otherwise reverse the order of the words
		//e.g: I love java ==> java love I
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a sentences");
		String sentences = scan.nextLine();
		int count=0;
		int control=0;
		int control2=0;
		
		//ali topu tut
		while(count<sentences.length()) {
			
			control2=sentences.indexOf("", control);
			control=control2;
			System.out.println(control);
			count++;
			System.out.print(count);
		}
		
		int asd= sentences.indexOf("t", 6);
		System.out.println(asd);
		
		scan.close();
	}

}
