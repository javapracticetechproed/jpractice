package second_week;

import java.util.Scanner;

public class UstAlma {

	public static void main(String[] args) {
		// Kullanicidan 2 sati alalim.
		//1. sayi taban
		//2. sayi Ust
		//1 sayinin ussunu hesaplayalim.
		// 3, 3  sonuc = 27
		
		//2  3 = 2*2*2=8
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen taban ve uss giriniz");
		
		int taban=input.nextInt();
		int uss = input.nextInt();
		long sonuc=1;
		
//		while(uss !=0) {
//			sonuc *=taban; // sonuc = sonuc*taban
//		
//		
//		--uss;
//	}
//		
//		System.out.println("Cevap: " + sonuc);
//	------------------------------------------------	
		//for cozum
		//for (; uss !=0; --uss)  --uss  uss-- 
		for (int i =1;i<=uss; i++) {	
		sonuc*=taban; //sonuc= sonuc*taban
		
		}
	System.out.println("Cevap: " +sonuc);
		
//	-----------------------------------------------	
//		sonuc = (long) Math.pow(taban, uss);
//		System.out.println("Cevap: " + sonuc);
//		

		input.close();
	
	}

}
