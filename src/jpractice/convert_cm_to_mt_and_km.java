package jpractice;

import java.util.Scanner;

public class convert_cm_to_mt_and_km {
	

	public static void main(String[] args) {
		/* Santimetreyi, metreye ve kilometreye �eviren bir program yaz�n�z.
		 ��kt� : 
		 L�tfen santimetre de�erini giriniz:
		 	212
		 212 santimetre 2.12 metre ve 0.00212 kilometreye e�ittir.
		 
		�pucu : 100 cm = 1 mt = 0.001 kilometre
		
		*/
		
		/// ek yap�lacak : 		bunu bir de methoda ge�irip, method �eklinde kullan�m daha verimli olaca��ndan bahset.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen santimetre de�erini giriniz:");
		int santimetre = scan.nextInt();
		float metre = santimetre / 100f;   /// ilk �nce burada 100 say�s� yaz, daha sonra 100f yap, hatay� g�ster
		float kilometre = santimetre / 100000f;
		
		System.out.println(santimetre + " santimetre, "+ metre + " metreye ve "+kilometre+" kilometreye e�ittir.");
		 
		/////ek yap�lacak b�l�m ba�lar
		
		System.out.println(santimetre + " santimetre, "+ getMetre(santimetre) + " metreye ve "+getKilometre(santimetre)+" kilometreye e�ittir.");
		
		/////ek yap�lacak b�l�m biter

	
	}
	
	
	public static float getMetre(int santimetre) {
		return santimetre / 100f;
	}
	
	public static float getKilometre(int santimetre) {
		return santimetre / 100000f;
	}
	
		

}
