package jpractice;

import java.util.Scanner;

public class forloop_whileloop_findsumofdigits_ofnumber {
	/* 1. Kullan�c�n�n girdi�i say�n�n, for d�ng�s� kullanarak rakamlar� toplam�n� bulan method yaz�n�z.
	 * 
	 * 1. Ad�m : Kullan�c�dan say� al.
	 * 2. Ad�m : Say�y� String'e �evirin.
	 * 3. Ad�m : String'in her eleman�n� say�ya �evir ve toplama ekle
	 * 
	 * Bunu method kullanarak yapal�m methodumuz toplam� return etsin.
	 * Method ismi : public static int getRakamlarToplami(int sayi)
	 * 
	*/
		
	
	/* 2. Kullan�c�n�n girdi�i say�n�n, while d�ng�s� kullanarak rakamlar� toplam�n� bulan method yaz�n�z.
	 * 
	 * 1. Ad�m : Kullan�c�dan say� al.
	 * 2. Ad�m : Say�n�n %10'unu alarak son hanesini al ve toplama ekle.
	 * 3. Ad�m : Daha sonra say�y� son haneden kurtarmak i�in 10'a b�l.
	 * 4. Ad�m : Say� 0 olarak kadar bu i�lemi while d�ng�s� ile tekrarla.
	 * 
	 * Bunu da method kullanarak yapal�m, toplam� return etsin.
	 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
	*/
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println("Rakamlar� toplam� : " + getRakamlarToplami(sayi));
	}
	
	
	public static int getRakamlarToplami(int sayi) {
		int toplam = 0;
		String sayiString = String.valueOf(sayi);
		
		
		for(int i = 0 ; i < sayiString.length() ; i++) {
			int sayiyaCevir = Integer.parseInt(sayiString.substring(i,i+1));
			toplam = toplam + sayiyaCevir;
			
		}
		
		return toplam;
		
	}
	
	
	public static int getRakamlarToplamiWhileDongusu(int sayi) {
		
		int sonHane = 0 ;
		int toplam = 0;
		//// 987
		while (sayi > 0 ) {
			sonHane = sayi % 10;   		/// 987 % 10 = 7       98 % 10 = 8 	 	 9 % 10 = 9
			toplam = sonHane + toplam;  /// 7 + 8 = 15  + 9 = 24
			sayi = sayi / 10;        	/// 98  			   9				 0
		}
		
		return toplam;
		
	}
}
