package first_week;

import java.util.Scanner;

public class Print12 {
	/*
	 * Girilen saati  saniyeye çeviren program yazýnýz
	 * 		Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
	 * 
	 * 1. Adým : Scanner sýnýfýndan nesne üretelim.
	 * 2. Adým : Kullanýcýdan saati alalým.
	 * 3. Adým : Kullanýcýdan dakikayý alalým.
	 * 4. Adým : Kullanýcýdan saniyeyi alalým.
	 * 5. Adým : Saati 3600 ile çarparak saniyeyi bulalým.
	 * 6. Adým : Dakikayý 60 ile çarparak saniyeyi bulalým.
	 * 7. Adým : Saatten ve dakikadan bulduðumuz saniyeyi, diðer saniye ile toplayarak toplam saniyeyi bulalým.
	 * 8. Adým : Ekrana yazdýralým.
	 * 
	 * 1 saat = 3600 saniye
	 * 1 dk   = 60 saniye
	 * 
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen saati giriniz : ");
		int saat = scan.nextInt();
		
		System.out.println("Lütfen dakikayý giriniz : ");
		int dakika = scan.nextInt();
		
		System.out.println("Lütfen saniyeyi giriniz : ");
		int saniye = scan.nextInt();
		
		int toplamSaniye = saat * 3600 + dakika * 60 + saniye;
		System.out.println("Toplam saniye : "+ toplamSaniye);
		
	}
}
