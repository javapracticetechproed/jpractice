package first_week;

import java.util.Scanner;

public class Print04 {
	/* Kullanýcýdan 2 tane sayý alalým ve toplama iþlemi yaptýrýp ekrana yazdýralým
	 * 
	 * 1. Adým : Scanner class'ýndan nesne üretelim.
	 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
	 * 3. Adým : Aldýðýmýz sayýlarý toplayarak, yeni bir deðiþkene atayalým.
	 * 4. Adým : Bunu ekrana yazdýralým.
	 * 5. Adým : Bunu float içinde yapalým.
	 *
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Lütfen 1. sayýyý girin : ");
		int num1 = scan.nextInt();
		
		System.out.println("Lütfen 2. sayýyý girin : ");
		int num2 = scan.nextInt();
	
		int toplama = num1 + num2;
		
		System.out.println(toplama);	*/
		
		///// yorum satýrýný burada göster
		
		System.out.println("Lütfen 1. sayýyý girin : ");
		float num11 = scan.nextFloat();
		
		System.out.println("Lütfen 2. sayýyý girin : ");
		float num22 = scan.nextFloat();
	
		float toplama2 = num11 + num22;
		
		System.out.println(toplama2);	
		
		
		
	}

}
