package jpractice;

public class print_all_characters {

	public static void main(String[] args) {
		/* String name = "Emine";
		 * use charAt method and print all letters on the console
		 * */
		
		String name = "emine";
		
		for(int i = 0; i < name.length() ; i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}
