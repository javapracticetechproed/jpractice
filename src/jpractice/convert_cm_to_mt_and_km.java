package jpractice;

import java.util.Scanner;

public class convert_cm_to_mt_and_km {
	

	public static void main(String[] args) {
		/* Santimetreyi, metreye ve kilometreye çeviren bir program yazınız.
		 Çıktı : 
		 Lütfen santimetre değerini giriniz:
		 	212
		 212 santimetre 2.12 metre ve 0.00212 kilometreye eşittir.
		 
		İpucu : 100 cm = 1 mt = 0.001 kilometre
		
		*/
		
		/// ek yapılacak : 		bunu bir de methoda geçirip, method şeklinde kullanım daha verimli olacağından bahset.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen santimetre değerini giriniz:");
		int santimetre = scan.nextInt();
		float metre = santimetre / 100f;   /// ilk önce burada 100 sayısı yaz, daha sonra 100f yap, hatayı göster
		float kilometre = santimetre / 100000f;
		
		System.out.println(santimetre + " santimetre, "+ metre + " metreye ve "+kilometre+" kilometreye eşittir.");
		 
		/////ek yapılacak bölüm başlar
		
		System.out.println(santimetre + " santimetre, "+ getMetre(santimetre) + " metreye ve "+getKilometre(santimetre)+" kilometreye eşittir.");
		
		/////ek yapılacak bölüm biter

	
	}
	
	
	public static float getMetre(int santimetre) {
		return santimetre / 100f;
	}
	
	public static float getKilometre(int santimetre) {
		return santimetre / 100000f;
	}
	
		

}
