package first_week;

import java.util.Scanner;

public class Print10 {

	/* Bölümden kalan sayýyý bulan program yazýnýz.
	 * 
	 * 1. Adým : Scanner ile nesne üretelim.
	 * 2. Adým : Kullanýcýdan bölünen sayýyý alýn
	 * 3. Adým : Kullanýcýdan bölen sayýyý alýn
	 * 4. Adým : Kalaný hesaplayalým
	 * 5. Adým : Ekrana yazdýralým.
	 *	
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bölünen sayýyý yazýnýz : ");
		int bolunen = scan.nextInt();
		
		System.out.println("Bölen sayýyý yazýnýz : ");
		int bolen = scan.nextInt();
		
		int kalan = bolunen % bolen;
				
		System.out.println("Kalan : " + kalan);
		

	}
}
