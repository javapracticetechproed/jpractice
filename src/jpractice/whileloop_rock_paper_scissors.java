package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class whileloop_rock_paper_scissors {
	/*	While d�ng�s� kullanarak ta� ka��t makas oyununu yaz�n�z. 
	 * 
	 * 1. Ad�m : TA� = 0, MAKASA = 1, KA�IT = 2
	 * 2. Ad�m : 3 kere kazanan ��kana kadar while d�ng�s�n� devam ettir.
	 * 3. Ad�m : While d�ng�s� i�erisinde, bilgisayar�n tahminini rastgele olu�tur.
	 * 4. Ad�m : While d�ng�s� i�erisinde, her seferinde kullan�c�dan say� girmesini iste.
	 * 5. Ad�m : Her tahmin sonunda kazanan� yazd�r, ve kazanan�n kazanma say�s�n� 1 art�r.
	 * 
	 * */

	public static void main(String[] args) {
		int kazanmaSayiBilgisayar = 0;
		int kazanmaSayiKullanici = 0;
		Scanner input = new Scanner(System.in);
		List<String> liste = new ArrayList<>();
		liste.add("TA� ");
		liste.add("MAKAS ");
		liste.add("KA�IT ");

		int bitis = 3;
		System.out.println("Ta� = 0, Makas = 1, Ka��t = 2");
		
		while (kazanmaSayiBilgisayar < bitis && kazanmaSayiKullanici < bitis) {
			
			int bilgisayarTahmin = new Random().nextInt(3);
			
			System.out.println("Tahmininiz : ");
			int kullaniciTahmin = input.nextInt();
			
			System.out.println("Bilgisayar : "+liste.get(bilgisayarTahmin));
			System.out.println("Siz : "+liste.get(kullaniciTahmin));
			
			if(kullaniciTahmin == bilgisayarTahmin) {
				System.out.println("Bu el berabere !");
			}else if(  (kullaniciTahmin == 0 && bilgisayarTahmin == 1 )  || (kullaniciTahmin == 1 && bilgisayarTahmin == 2) || ( bilgisayarTahmin == 2 && bilgisayarTahmin == 0 )  ) {
				System.out.println("Siz kazand�n�z.");
				kazanmaSayiKullanici++;
			}else {
				System.out.println("Bilgisayar kazand�.");
				kazanmaSayiBilgisayar++;
			}
			
		}
		
		System.out.println("Kullan�c� : " + kazanmaSayiKullanici + "\nBilgisayar : "+kazanmaSayiBilgisayar);
	}
}
