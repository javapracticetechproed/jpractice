package first_week;

import java.util.Scanner;

public class Print10 {

	/* B�l�mden kalan say�y� bulan program yaz�n�z.
	 * 
	 * 1. Ad�m : Scanner ile nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan b�l�nen say�y� al�n
	 * 3. Ad�m : Kullan�c�dan b�len say�y� al�n
	 * 4. Ad�m : Kalan� hesaplayal�m
	 * 5. Ad�m : Ekrana yazd�ral�m.
	 *	
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("B�l�nen say�y� yaz�n�z : ");
		int bolunen = scan.nextInt();
		
		System.out.println("B�len say�y� yaz�n�z : ");
		int bolen = scan.nextInt();
		
		int kalan = bolunen % bolen;
				
		System.out.println("Kalan : " + kalan);
		

	}
}
