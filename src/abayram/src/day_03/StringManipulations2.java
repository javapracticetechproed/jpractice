package day_03;

public class StringManipulations2 {

	public static void main(String[] args) {
		// create 2 words : name1 and name2
		// if the name1 has even numbers of characters,
		// then insert the second word in the middle of the first name
		// if the first word has odd numbers
		// Then print the “Name2 cannot be inserted in the name1”
		//
		// e.g:
		// name1= mehmet
		// name2= ahmet
		// Print ==> mehahmetmet

		String name1 = "mehmet";
		String name2 = "ahmet";
		// check if name1 has odd or even number of characters?
		boolean isTrue = name1.length() % 2 == 0;
		String firstHalf = name1.substring(0, name1.length() / 2);
		// NOTE: Beginning index inclusive BUT end index ins exclusive
		String secondHalf = name1.substring(name1.length() / 2);
		if (isTrue) {
			System.out.println(firstHalf + name2 + secondHalf);
		} else {
			System.out.println("Name2 cannot be inserted in the name1");

		}
	}
}