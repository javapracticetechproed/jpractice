package first_week;

import java.util.Scanner;

public class Print03 {
	
	/* Basit bir bilgi tablosu olu�tural�m.
	 * 
	 * 1. Ad�m : Scanner classtan nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan isim alal�m.
	 * 3. Ad�m : Kullan�c�dan soyisim alal�m.
	 * 4. Ad�m : Kullan�c�dan, boy bilgisi alal�m.
	 * 5. Ad�m : Kullan�c�dan, kilo bilgisi alal�m.
	 * 6. Ad�m : Kullan�c�dan, hobi bilgisi alal�m.
	 * 
	 * Not : T�m i�lemleri variable(de�i�ken) kullanarak yap�n.

	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen isminizi yaz�n�z : ");
		String isim = scan.next();
		System.out.println("L�tfen soyisminizi yaz�n�z : ");
		String soyIs�m = scan.next();		
		System.out.println("L�tfen boyunuzu yaz�n�z : ");
		int boy = scan.nextInt();
		System.out.println("L�tfen kilonuzu yaz�n�z : ");
		float kilo = scan.nextFloat();
		scan.nextLine();
		System.out.println("L�tfen hobilerinizi yaz�n�z : ");
		String hobi = scan.nextLine();							///// burada sadece next ve 
																///// next line fark� g�sterilebilir
		
		System.out.println("Bilgileriniz : ");
		System.out.println(isim + " " + soyIs�m);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		
		
	}

}
