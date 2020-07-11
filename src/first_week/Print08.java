package first_week;

import java.util.Scanner;

public class Print08 {
	
	/* Dikdörtgenin çevresini ve alanýný hespalayan program yazýnýz.
	 * 
	 * 1. Adým : Scanner ile nesne üretelim.
	 * 2. Adým : Kullanýcýdan dikdörtgenin yüksekliðini alalým.
	 * 3. Adým : Kullanýcýdan dikdörtgenin geniþliðini alalým.
	 * 4. Adým : Geniþlik ve yükseliði çarparak, diktörtgenin alanýný bulunuz.
	 * 5. Adým : Geniþlik ve yükseliði toplarak, 2 ile çarpýp diktörtgenin çevresini bulunuz.
	 * 6. Adým : Ekrana yazdýralým.
	 * 
	 */
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin yüksekliðini giriniz : ");
		int yukseklik = scan.nextInt();
		
		System.out.println("Dikdörtgenin geniþliðini giriniz : ");
		int genislik = scan.nextInt();
		
		float alan = yukseklik * genislik;
		
		float cevre = (yukseklik + genislik)*2;
		
		System.out.println("Alan : " +alan);
		System.out.println("Çevre : " +cevre);


	}

}
