package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist_greengrocer {
	/*
	 * Basit bir manav alýþveriþ programý yazýnýz.
	 * 
	 * 1. Adým : Ürün listesinden ürün seçtir ve kaç kilo olduðunu sor.
	 * 2. Adým : Baþka bir ürün almak isteyip istemediðini sor.
	 * 			 Ýstemiyorsa toplam miktarý göster, istiyorsa tekrar ürün seçtir.
	 * 			 Bu iþlemi alýþveriþi bitirmek isteyene kadar tekrarla.
	 * 3. Adým : Müþteri her ürün seçtiðinde, aldýðý ürünün fýyatýný toplam fiyata ekle.
	 * 4. Adým : Alýþveriþ bitince toplam ödemesi gereken tutarý göster. 
	 *
	 * */
	
	
	static List<String> urunListesi  = new ArrayList<>();		/// ilk önce burayý oluþturalým.
	static List<Float> urunFiyatlari  = new ArrayList<>();
	static float toplamOdenecekTutar;
	
	
	public static void main(String[] args) {
		
		urunListesi.add("Domates - Urun Kodu : 0");
		urunListesi.add("Biber - Urun Kodu : 1");
		urunListesi.add("Erik - Urun Kodu : 2");
		urunListesi.add("Karpuz - Urun Kodu : 3");
		urunListesi.add("Havuç - Urun Kodu : 4");
		
		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(10.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);

		System.out.println(urunListesi.toString());
		
		musteriyeNeSecmekIstediginiSor();
		
		
	}

	
	private static void musteriyeNeSecmekIstediginiSor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi ürünü seçmek istersiniz ?");
		int secim = scan.nextInt();
		System.out.println("Kaç kilo almak istersiniz ?");
		float kilo = scan.nextFloat();
		float urunFiyati = urunFiyatlari.get(secim);
		
		float toplamUrunFiyati = kilo * urunFiyati;
		toplamOdenecekTutar += toplamUrunFiyati;

		System.out.println("Seçtiðiniz ürün : " +urunListesi.get(secim));
		System.out.println("Ürünün Fiyatý : "   +toplamUrunFiyati);
		
		System.out.println("Alýþveriþe devam etmek isterseniz 1, kasaya gitmek isterseniz 2 yazýnýz : ");
		int karar = scan.nextInt();
		if(karar == 1)
			musteriyeNeSecmekIstediginiSor();
		else
			kasayaGit();
		 

	}


	private static void kasayaGit() {
		System.out.println("Toplam ödenecek tutar : " + toplamOdenecekTutar);
		
	}
}
