package first_week;

import java.util.Scanner;

public class Print13 {

	/* Çiftlikteki hayvanlarýn ayaklarýnýn toplam sayýsýný bulma.
	 * Çiftlikteki bulunun inek, koyun, tavuklarýn ayark sayýsýný hesaplayalým.
	 * 
	 * 1. Adým : Scanner sýnýfýndan nesne üretelim.
	 * 2. Adým : Kullanýcýdan çiftlikteki inek sayýsýný girmesini isteyelim.
	 * 3. Adým : Kullanýcýdan çiftlikteki koyun sayýsýný girmesini isteyelim.
	 * 4. Adým : Kullanýcýdan çiftlikteki tavuk sayýsýný girmesini isteyelim.
	 * 5. Adým : Ayak sayýsý ile hayvan sayýsýný çarparak ekrana yazdýralým.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen inek sayýsýný giriniz : ");
		int inekSayisi = scan.nextInt();
		
		System.out.println("Lütfen koyun sayýsýný giriniz : ");
		int koyunSayisi = scan.nextInt();
		
		System.out.println("Lütfen tavuk sayýsýný giriniz : ");
		int tavukSayisi = scan.nextInt();
		
		int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;
		
		System.out.println("Toplam Ayak : " + toplamAyak);
		
		
	}
	
}
