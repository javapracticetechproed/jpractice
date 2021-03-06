package first_week;

import java.util.Scanner;

public class KullanicidanVeriAlmak {
	
	/* Kullan�c�dan 8 primitive veri tipinde de de�er alal�m ve ekrana yazd�ral�m.
	 * 1. Ad�m : Scanner class'� ile kullan�c�dan veri alal�m
	 * 2. Ad�m : Ald��m�z her bir veriyi de�i�kenlere atayal�m
	 * 3. Ad�m : Ekrana yazd�ral�m.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BOOLEAN veri tipinde veri giriniz : ");
		boolean booleanVeri = scan.nextBoolean();
		

		System.out.println("CHAR veri tipinde veri giriniz : ");
		char charVeri = scan.next().charAt(0);
		
		System.out.println("BYTE veri tipinde veri giriniz : ");
		byte byteVeri = scan.nextByte();
		
		System.out.println("SHORT veri tipinde veri giriniz : ");
		short shortVeri = scan.nextShort();
		
		System.out.println("INTEGER veri tipinde veri giriniz : ");
		int intVeri = scan.nextInt();
		
		System.out.println("LONG veri tipinde veri giriniz : ");
		long longVeri = scan.nextLong();
		
		System.out.println("FLOAT veri tipinde veri giriniz : ");
		float floatVeri = scan.nextFloat();
		
		System.out.println("DOUBLE veri tipinde veri giriniz : ");
		double doubleVeri = scan.nextDouble();
		
		System.out.println("");
		
		
		System.out.println("BOOLEAN : " +booleanVeri);
		System.out.println("CHAR : " +charVeri);
		System.out.println("BYTE : " +byteVeri);
		System.out.println("SHORT : " +shortVeri);
		System.out.println("INTEGER : " +intVeri);
		System.out.println("LONG : " +longVeri);
		System.out.println("FLOAT : " +floatVeri);
		System.out.println("DOUBLE : " +doubleVeri);

		
	}

}
