package first_week;

import java.util.Scanner;

public class Print08 {
	
	/* Dikd�rtgenin �evresini ve alan�n� hespalayan program yaz�n�z.
	 * 
	 * 1. Ad�m : Scanner ile nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan dikd�rtgenin y�ksekli�ini alal�m.
	 * 3. Ad�m : Kullan�c�dan dikd�rtgenin geni�li�ini alal�m.
	 * 4. Ad�m : Geni�lik ve y�kseli�i �arparak, dikt�rtgenin alan�n� bulunuz.
	 * 5. Ad�m : Geni�lik ve y�kseli�i toplarak, 2 ile �arp�p dikt�rtgenin �evresini bulunuz.
	 * 6. Ad�m : Ekrana yazd�ral�m.
	 * 
	 */
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgenin y�ksekli�ini giriniz : ");
		int yukseklik = scan.nextInt();
		
		System.out.println("Dikd�rtgenin geni�li�ini giriniz : ");
		int genislik = scan.nextInt();
		
		float alan = yukseklik * genislik;
		
		float cevre = (yukseklik + genislik)*2;
		
		System.out.println("Alan : " +alan);
		System.out.println("�evre : " +cevre);


	}

}
