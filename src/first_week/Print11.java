package first_week;

import java.util.Scanner;

public class Print11 {
	
	/*
	 * Saniyeyi saat, dk ve saniyeye �eviren bir program yaz�n�z.
	 * 		�rnek : 4250 - > 1 saat 10 dakika 50 saniye
	 * 
	 * 1. Ad�m : Scanner s�n�f�ndan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan saniye alal�m.
	 * 3. Ad�m : Saniyeyi 3600'a b�lerek saati bulal�m.
	 * 4. Ad�m : Saniyeyi 3600'a b�ld�kten sonra kalan� alal�m ve onu 60'a b�lerek dk'y� bulal�m.
	 * 5. Ad�m : Dk'y� bulduktan sonra kalan� saniye olarak yazal�m.
	 * 
	 * 1 saat = 3600 saniye
	 * 1 dk   = 60 saniye
	 * 
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen saniyeyi giriniz : ");
		int toplamSaniye = scan.nextInt();
		
		int saat = toplamSaniye / 3600;
		int kalanSaniye = toplamSaniye % 3600;
		
		int dk = kalanSaniye / 60;
		kalanSaniye = kalanSaniye % 60;
		
		System.out.println(saat + " saat " + dk + " dakika " + kalanSaniye + " saniye");
		
	}

}
