package first_week;

import java.util.Scanner;

public class Print05 {
	
	/* Kullan�c�dan 2 tane say� alal�m ve ��karma i�lemi yapt�r�p ekrana yazd�ral�m
	 * 
	 * 1. Ad�m : Scanner class'�ndan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan 2 tane say� isteyelim.
	 * 3. Ad�m : Ald���m�z say�lardan ikinci say�y� birinci say�dan ��karal�m.
	 * 4. Ad�m : Bunu ekrana yazd�ral�m.
	 * 5. Ad�m : Bunu float i�inde yapal�m.
	 *
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("L�tfen 1. say�y� girin : ");
		int num1 = scan.nextInt();
		
		System.out.println("L�tfen 2. say�y� girin : ");
		int num2 = scan.nextInt();
	
		int cikarma = num1 - num2;
		
		System.out.println(toplama);	*/
		
		
		
		System.out.println("L�tfen 1. say�y� girin : ");
		float num11 = scan.nextFloat();
		
		System.out.println("L�tfen 2. say�y� girin : ");
		float num22 = scan.nextFloat();
	
		float cikarma2 = num11 - num22;
		
		System.out.println(cikarma2);	

	}

}
