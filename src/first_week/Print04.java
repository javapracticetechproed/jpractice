package first_week;

import java.util.Scanner;

public class Print04 {
	/* Kullan�c�dan 2 tane say� alal�m ve toplama i�lemi yapt�r�p ekrana yazd�ral�m
	 * 
	 * 1. Ad�m : Scanner class'�ndan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan 2 tane say� isteyelim.
	 * 3. Ad�m : Ald���m�z say�lar� toplayarak, yeni bir de�i�kene atayal�m.
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
	
		int toplama = num1 + num2;
		
		System.out.println(toplama);	*/
		
		///// yorum sat�r�n� burada g�ster
		
		System.out.println("L�tfen 1. say�y� girin : ");
		float num11 = scan.nextFloat();
		
		System.out.println("L�tfen 2. say�y� girin : ");
		float num22 = scan.nextFloat();
	
		float toplama2 = num11 + num22;
		
		System.out.println(toplama2);	
		
		
		
	}

}
