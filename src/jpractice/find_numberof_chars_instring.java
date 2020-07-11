package jpractice;

public class find_numberof_chars_instring {

	public static void main(String[] args) {
		/*
			Create a method called numberOfChars and pass 2 parameters 1-car 2-String
			char ch = 'p';
			String str = "population is number of people";
			int count = 0;
			then find how many times the given char is repeated in the String
			and print it on the console
			use for loop, increment and if statements
		*/
		
		char ch = 'p';
		String str = "population is number of people";
		
		System.out.println(numberOfChars(ch, str));
	}
	
	public static int numberOfChars(char ch, String str) {
		int counter = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				counter++;
			}
		}
		
		return counter;
	}

}
