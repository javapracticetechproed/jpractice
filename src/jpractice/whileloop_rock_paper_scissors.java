package jpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class whileloop_rock_paper_scissors {
	/*	While döngüsü kullanarak taþ kaðýt makas oyununu yazýnýz. 
	 * 
	 * 1. Adým : TAÞ = 0, MAKASA = 1, KAÐIT = 2
	 * 2. Adým : 3 kere kazanan çýkana kadar while döngüsünü devam ettir.
	 * 3. Adým : While döngüsü içerisinde, bilgisayarýn tahminini rastgele oluþtur.
	 * 4. Adým : While döngüsü içerisinde, her seferinde kullanýcýdan sayý girmesini iste.
	 * 5. Adým : Her tahmin sonunda kazananý yazdýr, ve kazananýn kazanma sayýsýný 1 artýr.
	 * 
	 * */

	public static void main(String[] args) {
		int kazanmaSayiBilgisayar = 0;
		int kazanmaSayiKullanici = 0;
		Scanner input = new Scanner(System.in);
		List<String> liste = new ArrayList<>();
		liste.add("TAÞ ");
		liste.add("MAKAS ");
		liste.add("KAÐIT ");

		int bitis = 3;
		System.out.println("Taþ = 0, Makas = 1, Kaðýt = 2");
		
		while (kazanmaSayiBilgisayar < bitis && kazanmaSayiKullanici < bitis) {
			
			int bilgisayarTahmin = new Random().nextInt(3);
			
			System.out.println("Tahmininiz : ");
			int kullaniciTahmin = input.nextInt();
			
			System.out.println("Bilgisayar : "+liste.get(bilgisayarTahmin));
			System.out.println("Siz : "+liste.get(kullaniciTahmin));
			
			if(kullaniciTahmin == bilgisayarTahmin) {
				System.out.println("Bu el berabere !");
			}else if(  (kullaniciTahmin == 0 && bilgisayarTahmin == 1 )  || (kullaniciTahmin == 1 && bilgisayarTahmin == 2) || ( bilgisayarTahmin == 2 && bilgisayarTahmin == 0 )  ) {
				System.out.println("Siz kazandýnýz.");
				kazanmaSayiKullanici++;
			}else {
				System.out.println("Bilgisayar kazandý.");
				kazanmaSayiBilgisayar++;
			}
			
		}
		
		System.out.println("Kullanýcý : " + kazanmaSayiKullanici + "\nBilgisayar : "+kazanmaSayiBilgisayar);
	}
}
