package fourth_week;

import java.util.Scanner;

public class Method_ForLoop01 {
	
	/* Girilen say�n�n faktoriyelini bulan bir method yaz�n�z. 
	 * getFaktoriel();    // long
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� giriniz : ");
		long sayi = scan.nextLong();
		
		long faktoriel = getFaktoriel(sayi);
		
		System.out.println("Sonu� : " + faktoriel);
		
		long faktorielYeni = getFaktorielYeni(sayi);
		
		System.out.println("Sonu�Yeni : " + faktorielYeni);

		
		// 5 * 4 * 3 * 2 * 1 = 120
		
	}

	private static long getFaktoriel(long sayi) {
		if(sayi == 0 || sayi == 1) {
			return 1;
		}
		
		long faktoriyel = 1;
		for(int i = 1; i <= sayi ; i++ ) {   //  1  -  5
			faktoriyel *= i;				 //  1*1 = faktoriyel   2*2   2 * 3 = 6    4 * 6 = 24      24 * 5 = 120      
		}

		return faktoriyel;
	}
	
	
	private static long getFaktorielYeni(long sayi) {
		if(sayi == 0 || sayi == 1) {
			return 1;
		}else {
			return sayi * getFaktorielYeni(sayi - 1 );
		}
	}
	
	

}
