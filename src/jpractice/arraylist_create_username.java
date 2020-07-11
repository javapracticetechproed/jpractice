package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class arraylist_create_username {

	/*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
	 *  1. Ad�m : Kullan�c�dan ismini isteyelim
	 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
	 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
	 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
	 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
	 
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen kullanmak istedi�iniz kullan�c� ad�n� yaz�n�n : ");
		String girilenKullaniciAdi = scan.nextLine();
		String kullaniciAdi = girilenKullaniciAdi.replace(" ", "");
		
		System.out.println(kullaniciAdi);      // BURADA DUR  ****************
		
												// Veritaban� olay�ndan bahset, List olu�tur.
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		veritabanindakiKullaniciListesi.add("Hamza06");
		
												// Twitter �rne�i verilebilir.
		
		boolean kullaniciAdiVeritabanindaVarMi = veritabanindakiKullaniciListesi.contains(kullaniciAdi);
		
												// Burada hem ternary hem if else kullanabiliriz
		
		if(kullaniciAdiVeritabanindaVarMi)
			System.out.println("Bu kullan�c� ad� zaten al�nm��.");
		else
			System.out.println("Bu kullan�c� ad� al�nabilir.");

		
		System.out.println(kullaniciAdiVeritabanindaVarMi ? "Bu kullan�c� ad� zaten al�nm��." : "Bu kullan�c� ad� al�nabilir.");
		
//4.ADIM		
		if(kullaniciAdiVeritabanindaVarMi) {
			int rastgeleSayi = new Random().nextInt(100000);
			kullaniciAdi += ""+rastgeleSayi;
			System.out.println("Yeni Kullan�c� Ad�n�z : " + kullaniciAdi);
			
		}else {
			System.out.println("Yeni Kullan�c� Ad�n�z : " + kullaniciAdi);

		}
			
		
		
		
		
		
	}

}
