package first_week;

import java.util.Scanner;

public class Print09 {

	/* Vücut kitle indeksini hesaplayan bir program yazýnýz.
	 * 
	 * 1. Adým : Scanner ile nesne üretelim.
	 * 2. Adým : Kullanýcýdan boyunu alalým. (float)
	 * 3. Adým : Kullanýcýdan kilosunu alalým. (float)
	 * 4. Adým : Kullanýcýnýn boyunun karesini alalým.
	 * 5. Adým : Kullanýcýnýn kilosunu, boyunun karesine bölelim.
	 * 6. Adým : Ekrana yazdýralým.
	 * 
	 */
	
	// Ýpucu : Vücut Kitle Ýndeksi (VKÝ) = Vücut Aðýrlýðý (kg.) / Boy uzunluðunun karesi (m.)
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu yazýnýz (metre): ");
		float boy = scan.nextFloat();
		
		System.out.println("Lütfen kilonuzu yazýnýz (kilogram): ");
		float kilo = scan.nextFloat();
		
		float boyKare = boy * boy;
		
		float vucutIndeksi = kilo / boyKare;
		
		System.out.println(vucutIndeksi);
		

	}
	

}
