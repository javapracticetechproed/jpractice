package first_week;

import java.util.Scanner;

public class Print12 {
	/*
	 * Girilen saati  saniyeye �eviren program yaz�n�z
	 * 		�rnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
	 * 
	 * 1. Ad�m : Scanner s�n�f�ndan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan saati alal�m.
	 * 3. Ad�m : Kullan�c�dan dakikay� alal�m.
	 * 4. Ad�m : Kullan�c�dan saniyeyi alal�m.
	 * 5. Ad�m : Saati 3600 ile �arparak saniyeyi bulal�m.
	 * 6. Ad�m : Dakikay� 60 ile �arparak saniyeyi bulal�m.
	 * 7. Ad�m : Saatten ve dakikadan buldu�umuz saniyeyi, di�er saniye ile toplayarak toplam saniyeyi bulal�m.
	 * 8. Ad�m : Ekrana yazd�ral�m.
	 * 
	 * 1 saat = 3600 saniye
	 * 1 dk   = 60 saniye
	 * 
	 */
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen saati giriniz : ");
		int saat = scan.nextInt();
		
		System.out.println("L�tfen dakikay� giriniz : ");
		int dakika = scan.nextInt();
		
		System.out.println("L�tfen saniyeyi giriniz : ");
		int saniye = scan.nextInt();
		
		int toplamSaniye = saat * 3600 + dakika * 60 + saniye;
		System.out.println("Toplam saniye : "+ toplamSaniye);
		
	}
}
