package first_week;

import java.util.Scanner;

public class Print14 {
	
	
	/* Kullanýcýnýn girdiði short sayýyý integere çeviren bir program yazýnýz.
	 * Kullanýcýnýn girdiði integerý shorta çeviren bir program yazýnýz.
	 * 
	 * 	1. Adým : Scanner sýnýfýndan nesne üretelim.
	 * 	2. Adým : Aldýðýmýz sayýyý long a çevirelim.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayýyý giriniz..");
		System.out.println(Short.MAX_VALUE);
		/*short sayi = scan.nextShort();
		
		short uzunSayi = sayi;
		
		System.out.println(uzunSayi);*/
		
		int sayi = scan.nextInt();
		short kisaSayi = (short)sayi;
		
		System.out.println(kisaSayi);
		
		
		
		
	}
}
