package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist_greengrocer {
	/*
	 * Basit bir manav al��veri� program� yaz�n�z.
	 * 
	 * 1. Ad�m : �r�n listesinden �r�n se�tir ve ka� kilo oldu�unu sor.
	 * 2. Ad�m : Ba�ka bir �r�n almak isteyip istemedi�ini sor.
	 * 			 �stemiyorsa toplam miktar� g�ster, istiyorsa tekrar �r�n se�tir.
	 * 			 Bu i�lemi al��veri�i bitirmek isteyene kadar tekrarla.
	 * 3. Ad�m : M��teri her �r�n se�ti�inde, ald��� �r�n�n f�yat�n� toplam fiyata ekle.
	 * 4. Ad�m : Al��veri� bitince toplam �demesi gereken tutar� g�ster. 
	 *
	 * */
	
	
	static List<String> urunListesi  = new ArrayList<>();		/// ilk �nce buray� olu�tural�m.
	static List<Float> urunFiyatlari  = new ArrayList<>();
	static float toplamOdenecekTutar;
	
	
	public static void main(String[] args) {
		
		urunListesi.add("Domates - Urun Kodu : 0");
		urunListesi.add("Biber - Urun Kodu : 1");
		urunListesi.add("Erik - Urun Kodu : 2");
		urunListesi.add("Karpuz - Urun Kodu : 3");
		urunListesi.add("Havu� - Urun Kodu : 4");
		
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
		System.out.println("Hangi �r�n� se�mek istersiniz ?");
		int secim = scan.nextInt();
		System.out.println("Ka� kilo almak istersiniz ?");
		float kilo = scan.nextFloat();
		float urunFiyati = urunFiyatlari.get(secim);
		
		float toplamUrunFiyati = kilo * urunFiyati;
		toplamOdenecekTutar += toplamUrunFiyati;

		System.out.println("Se�ti�iniz �r�n : " +urunListesi.get(secim));
		System.out.println("�r�n�n Fiyat� : "   +toplamUrunFiyati);
		
		System.out.println("Al��veri�e devam etmek isterseniz 1, kasaya gitmek isterseniz 2 yaz�n�z : ");
		int karar = scan.nextInt();
		if(karar == 1)
			musteriyeNeSecmekIstediginiSor();
		else
			kasayaGit();
		 

	}


	private static void kasayaGit() {
		System.out.println("Toplam �denecek tutar : " + toplamOdenecekTutar);
		
	}
}
