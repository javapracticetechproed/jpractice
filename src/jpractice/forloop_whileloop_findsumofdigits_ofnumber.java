package jpractice;

import java.util.Scanner;

public class forloop_whileloop_findsumofdigits_ofnumber {
	/* 1. Kullanýcýnýn girdiði sayýnýn, for döngüsü kullanarak rakamlarý toplamýný bulan method yazýnýz.
	 * 
	 * 1. Adým : Kullanýcýdan sayý al.
	 * 2. Adým : Sayýyý String'e çevirin.
	 * 3. Adým : String'in her elemanýný sayýya çevir ve toplama ekle
	 * 
	 * Bunu method kullanarak yapalým methodumuz toplamý return etsin.
	 * Method ismi : public static int getRakamlarToplami(int sayi)
	 * 
	*/
		
	
	/* 2. Kullanýcýnýn girdiði sayýnýn, while döngüsü kullanarak rakamlarý toplamýný bulan method yazýnýz.
	 * 
	 * 1. Adým : Kullanýcýdan sayý al.
	 * 2. Adým : Sayýnýn %10'unu alarak son hanesini al ve toplama ekle.
	 * 3. Adým : Daha sonra sayýyý son haneden kurtarmak için 10'a böl.
	 * 4. Adým : Sayý 0 olarak kadar bu iþlemi while döngüsü ile tekrarla.
	 * 
	 * Bunu da method kullanarak yapalým, toplamý return etsin.
	 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
	*/
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println("Rakamlarý toplamý : " + getRakamlarToplami(sayi));
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
