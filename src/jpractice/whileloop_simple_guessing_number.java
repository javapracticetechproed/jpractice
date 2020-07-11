package jpractice;

import java.util.Random;
import java.util.Scanner;

public class whileloop_simple_guessing_number {

	/*
	 * Whilde döngüsü kullanarak "sayý tahmin oyunu" yazýnýz. 
	 * 
	 * 1. Adým : Java ile rastgele bir sayý üretelim (new Random() kullanabilrsiniz)
	 * 2. Adým : Kullanýcýdan tahminini alalým.
	 * 3. Adým : Kullanýcýnýn girdiði tahmini, bilgisayarýn ürettiði rastgele sayý ile karþýlaþtýralým.
	 * 4. Adým : Cevap doðru olana kadar 2. ve 3. adýmý tekrarlayalým, bunu da while döngüsü ile yapalým.
	 *
	 * */
	
	
	public static void main(String[] args) {
		Random random = new Random();
		int rastgeleSayi = 1 + random.nextInt(50); 
		int tahmin = 0;
		Scanner input = new Scanner(System.in);
		while(rastgeleSayi != tahmin) {
			System.out.println(rastgeleSayi+" Lütfen tahmininizi yazýnýz : ");
			tahmin = input.nextInt();
			
			if(tahmin == rastgeleSayi) {
				System.out.println("Doðru Cevap Oyun Bitti !");
			}else {
				System.out.println("Yanlýþ ! Tekrar dene !");
			}
		}
	}
	
}
