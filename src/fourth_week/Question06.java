package fourth_week;

import java.util.Scanner;

public class Question06 {

	/*	Girilen say� ya metnin polindrom olup olmad���n� kontrol eden bir method yaz�n�z.
	 *  method boolean olarak bir de�er return etsin.
	 *  
	 *  getPolindrom(String metin)
	 * 
	 *  2 ge�e ba�layaca��z.
	 * */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir ifade yaz�n�z : ");
		String ifade = scan.nextLine();
		
		if(getPolindrom(ifade.toLowerCase())) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom De�il");
		}
	}

	private static boolean getPolindrom(String ifade) {

		// kelimek
		// 0123456  
		int i = 0;
		int j = ifade.length()-1;
		
		while(i < j) {
			
			if(ifade.charAt(i) != ifade.charAt(j)){
				return false;
			}
			
			i++;
			j--;
		}
				
		return true;
	}
	
	private static boolean getPolindromYeni(String word) {
		String wordTers = "";
   		boolean ne = false;
   		
   		for(int i = word.length()-1; i>=0; i--) {
   			wordTers = wordTers + word.charAt(i);
   		}
   		
   		if(wordTers.equalsIgnoreCase(word)) {
   			ne = true;
   		}else {
   			ne = false;
   		}  	

   		return ne;
	}
	
}
