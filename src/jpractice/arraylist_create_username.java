package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class arraylist_create_username {

	/*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
	 *  1. Adým : Kullanýcýdan ismini isteyelim
	 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
	 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
	 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
	 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
	 
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kullanmak istediðiniz kullanýcý adýný yazýnýn : ");
		String girilenKullaniciAdi = scan.nextLine();
		String kullaniciAdi = girilenKullaniciAdi.replace(" ", "");
		
		System.out.println(kullaniciAdi);      // BURADA DUR  ****************
		
												// Veritabaný olayýndan bahset, List oluþtur.
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		veritabanindakiKullaniciListesi.add("Hamza06");
		
												// Twitter örneði verilebilir.
		
		boolean kullaniciAdiVeritabanindaVarMi = veritabanindakiKullaniciListesi.contains(kullaniciAdi);
		
												// Burada hem ternary hem if else kullanabiliriz
		
		if(kullaniciAdiVeritabanindaVarMi)
			System.out.println("Bu kullanýcý adý zaten alýnmýþ.");
		else
			System.out.println("Bu kullanýcý adý alýnabilir.");

		
		System.out.println(kullaniciAdiVeritabanindaVarMi ? "Bu kullanýcý adý zaten alýnmýþ." : "Bu kullanýcý adý alýnabilir.");
		
//4.ADIM		
		if(kullaniciAdiVeritabanindaVarMi) {
			int rastgeleSayi = new Random().nextInt(100000);
			kullaniciAdi += ""+rastgeleSayi;
			System.out.println("Yeni Kullanýcý Adýnýz : " + kullaniciAdi);
			
		}else {
			System.out.println("Yeni Kullanýcý Adýnýz : " + kullaniciAdi);

		}
			
		
		
		
		
		
	}

}
