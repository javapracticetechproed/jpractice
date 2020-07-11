package first_week;

import java.util.Scanner;

public class Print15 {
	
	/* Kullanýcýnýn ekrana yazdýðý karakterin ASCII tablosuna göre numarasýný bulun.
	 * 
	 * 1. Adým : Scanner ile nesne üretelim.
	 * 2. Adým : Kullanýcýdan sorgulamak istediði karakteri yazmasýný isteyelim.
	 * 3. Adým : Ekrana yazdýralým.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ASCII tablosunda sorgulamak istediðiniz karakteri yazýnýz : ");
		char ch = scan.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("ASCII : " + ascii);
        
        char chTanimlama = (char) 97;
        System.out.println(chTanimlama);

    }

}
