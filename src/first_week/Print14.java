package first_week;

import java.util.Scanner;

public class Print14 {
	
	
	/* Kullan�c�n�n girdi�i short say�y� integere �eviren bir program yaz�n�z.
	 * Kullan�c�n�n girdi�i integer� shorta �eviren bir program yaz�n�z.
	 * 
	 * 	1. Ad�m : Scanner s�n�f�ndan nesne �retelim.
	 * 	2. Ad�m : Ald���m�z say�y� long a �evirelim.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen say�y� giriniz..");
		System.out.println(Short.MAX_VALUE);
		/*short sayi = scan.nextShort();
		
		short uzunSayi = sayi;
		
		System.out.println(uzunSayi);*/
		
		int sayi = scan.nextInt();
		short kisaSayi = (short)sayi;
		
		System.out.println(kisaSayi);
		
		
		
		
	}
}
