package jpractice;

public class reverse_sentence {

	public static void main(String[] args) {
		/* Create a String variable sentence then reverse the sentence
		 * 
		 * e.g : I love Java == > java love I
		 * String reverse = "";
		 *
		 * use substring method
		 */

		String sentence = "I love java";
		String reverse = sentence.substring(7) + sentence.substring(1,7)+sentence.substring(0,1);
		
		System.out.println(reverse);
	}

}
