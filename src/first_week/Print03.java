package first_week;

import java.util.Scanner;

public class Print03 {
	
	/* Basit bir bilgi tablosu oluþturalým.
	 * 
	 * 1. Adým : Scanner classtan nesne üretelim.
	 * 2. Adým : Kullanýcýdan isim alalým.
	 * 3. Adým : Kullanýcýdan soyisim alalým.
	 * 4. Adým : Kullanýcýdan, boy bilgisi alalým.
	 * 5. Adým : Kullanýcýdan, kilo bilgisi alalým.
	 * 6. Adým : Kullanýcýdan, hobi bilgisi alalým.
	 * 
	 * Not : Tüm iþlemleri variable(deðiþken) kullanarak yapýn.

	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi yazýnýz : ");
		String isim = scan.next();
		System.out.println("Lütfen soyisminizi yazýnýz : ");
		String soyIsým = scan.next();		
		System.out.println("Lütfen boyunuzu yazýnýz : ");
		int boy = scan.nextInt();
		System.out.println("Lütfen kilonuzu yazýnýz : ");
		float kilo = scan.nextFloat();
		scan.nextLine();
		System.out.println("Lütfen hobilerinizi yazýnýz : ");
		String hobi = scan.nextLine();							///// burada sadece next ve 
																///// next line farký gösterilebilir
		
		System.out.println("Bilgileriniz : ");
		System.out.println(isim + " " + soyIsým);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		
		
	}

}
