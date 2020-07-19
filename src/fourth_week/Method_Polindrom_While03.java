package fourth_week;

import java.util.Scanner;

public class Method_Polindrom_While03 {

	/*	Girilen sayý ya metnin polindrom olup olmadýðýný kontrol eden bir method yazýnýz.
	 *  method boolean olarak bir deðer return etsin.
	 *  
	 *  getPolindrom(String metin)
	 * 
	 *  2 geçe baþlayacaðýz.
	 * */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade yazýnýz : ");
		String ifade = scan.nextLine();
		
		if(getPolindrom(ifade.toLowerCase())) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom Deðil");
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
