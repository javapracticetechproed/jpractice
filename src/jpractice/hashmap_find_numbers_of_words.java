package jpractice;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap_find_numbers_of_words {

	///			KEL�ME ANAL�Z�
	
	/*
	 * Girilen bir metinde kelimelerin ka� kere ge�ti�ini bulan program yaz�n�z.
	 * 
	 * 1. Ad�m : ( Kelime = Ka� Kere Ge�iyor ) �eklinde veri tutmak i�in HashMap olu�turun.
	 * 2. Ad�m : Girilen metni split methodu ile par�alayal�m.	
	 * 			 ilk �nce "." ya g�re par�alay�p c�mleleri elde edelim
	 * 			 daha sonra " " bo�lu�a g�re par�alay�p kelimeleri elde edelim	
	 * 3. Ad�m : T�m kelimeleri kontrol etmek i�in for d�ng�s� kullanal�m ve t�m kelimeleri olu�turdu�umuz hashMap'e aktaral�m.
	 * 			 E�er hashmap'te yoksa ekleyelim ve say�s�na 1 yazal�m.
	 * 		 	 E�er hashmap'te zaten varsa, say�s�n� bir art�ral�m.
	 * 3. Ad�m : T�m kelimeler kontrol edildikten ��kt� verelim. Ve t�m kelimeleri tekrar say�s�yla birlikte g�sterelim.
	 * 
	 * �pucu : "." �zel karakter oldu�u i�in "\\." �eklinde split ediniz.
	 * */
	
	
	///// �rnek bir par�alama �iz
	
	//		c�mle bir. c�mle iki
	//		1. c�mle bir --- >> c�mle (1) , bir (1)
	//		2. c�mle iki --- >> c�mle (2) , iki (1)
	
	
	//// ad�m ad�m s�re ver bu soruda
	//// noktaya g�re par�alama 2 dk
	//// kelimelere g�re par�alama 4 dk
	
	static HashMap<String,Integer> kelimeListesi = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kelime analizi yap�lmas�n� istedi�iniz metni giriniz : ");
		String metin = scan.nextLine();
		String[] cumleler = metin.split("\\.");

		for(int i = 0 ; i < cumleler.length ; i++) {
			String[] kelimeler = cumleler[i].trim().split(" ");
			
			for(int j = 0 ; j < kelimeler.length; j++) {
				if(kelimeListesi.get(kelimeler[j]) == null) { 		///// .replace(",", "").replace("\"", "")
					kelimeListesi.put(kelimeler[j], 1);		  		///// .replace(",", "").replace("\"", "")
				}else {
					int sayi = kelimeListesi.get(kelimeler[j]);		///  .replace(",", "").replace("\"", "")
					kelimeListesi.put(kelimeler[j], sayi + 1);		///// .replace(",", "").replace("\"", "")
				}
			}
			
		}
		
		for(String eleman : kelimeListesi.keySet()) {
			System.out.println(eleman + " : "+ kelimeListesi.get(eleman));
		}
		
		
	}
}
