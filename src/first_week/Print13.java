package first_week;

import java.util.Scanner;

public class Print13 {

	/* �iftlikteki hayvanlar�n ayaklar�n�n toplam say�s�n� bulma.
	 * �iftlikteki bulunun inek, koyun, tavuklar�n ayark say�s�n� hesaplayal�m.
	 * 
	 * 1. Ad�m : Scanner s�n�f�ndan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan �iftlikteki inek say�s�n� girmesini isteyelim.
	 * 3. Ad�m : Kullan�c�dan �iftlikteki koyun say�s�n� girmesini isteyelim.
	 * 4. Ad�m : Kullan�c�dan �iftlikteki tavuk say�s�n� girmesini isteyelim.
	 * 5. Ad�m : Ayak say�s� ile hayvan say�s�n� �arparak ekrana yazd�ral�m.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen inek say�s�n� giriniz : ");
		int inekSayisi = scan.nextInt();
		
		System.out.println("L�tfen koyun say�s�n� giriniz : ");
		int koyunSayisi = scan.nextInt();
		
		System.out.println("L�tfen tavuk say�s�n� giriniz : ");
		int tavukSayisi = scan.nextInt();
		
		int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;
		
		System.out.println("Toplam Ayak : " + toplamAyak);
		
		
	}
	
}
