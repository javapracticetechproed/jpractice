package first_week;

import java.util.Scanner;

public class Print11 {
	
	/*
	 * Saniyeyi saat, dk ve saniyeye çeviren bir program yazýnýz.
	 * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
	 * 
	 * 1. Adým : Scanner sýnýfýndan nesne üretelim.
	 * 2. Adým : Kullanýcýdan saniye alalým.
	 * 3. Adým : Saniyeyi 3600'a bölerek saati bulalým.
	 * 4. Adým : Saniyeyi 3600'a böldükten sonra kalaný alalým ve onu 60'a bölerek dk'yý bulalým.
	 * 5. Adým : Dk'yý bulduktan sonra kalaný saniye olarak yazalým.
	 * 
	 * 1 saat = 3600 saniye
	 * 1 dk   = 60 saniye
	 * 
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen saniyeyi giriniz : ");
		int toplamSaniye = scan.nextInt();
		
		int saat = toplamSaniye / 3600;
		int kalanSaniye = toplamSaniye % 3600;
		
		int dk = kalanSaniye / 60;
		kalanSaniye = kalanSaniye % 60;
		
		System.out.println(saat + " saat " + dk + " dakika " + kalanSaniye + " saniye");
		
	}

}
