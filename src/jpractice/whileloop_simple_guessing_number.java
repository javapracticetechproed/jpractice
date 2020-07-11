package jpractice;

import java.util.Random;
import java.util.Scanner;

public class whileloop_simple_guessing_number {

	/*
	 * Whilde d�ng�s� kullanarak "say� tahmin oyunu" yaz�n�z. 
	 * 
	 * 1. Ad�m : Java ile rastgele bir say� �retelim (new Random() kullanabilrsiniz)
	 * 2. Ad�m : Kullan�c�dan tahminini alal�m.
	 * 3. Ad�m : Kullan�c�n�n girdi�i tahmini, bilgisayar�n �retti�i rastgele say� ile kar��la�t�ral�m.
	 * 4. Ad�m : Cevap do�ru olana kadar 2. ve 3. ad�m� tekrarlayal�m, bunu da while d�ng�s� ile yapal�m.
	 *
	 * */
	
	
	public static void main(String[] args) {
		Random random = new Random();
		int rastgeleSayi = 1 + random.nextInt(50); 
		int tahmin = 0;
		Scanner input = new Scanner(System.in);
		while(rastgeleSayi != tahmin) {
			System.out.println(rastgeleSayi+" L�tfen tahmininizi yaz�n�z : ");
			tahmin = input.nextInt();
			
			if(tahmin == rastgeleSayi) {
				System.out.println("Do�ru Cevap Oyun Bitti !");
			}else {
				System.out.println("Yanl�� ! Tekrar dene !");
			}
		}
	}
	
}
