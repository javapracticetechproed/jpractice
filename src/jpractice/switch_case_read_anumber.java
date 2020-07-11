package jpractice;

import java.util.Scanner;

public class switch_case_read_anumber {
	/*
	 * Soru: Klavyeden girilen herhangi bir sayýnýn, okunuþunu ekrana yazdýrýnýz. 
	 * (max yazýlabilecek sayý 999 olsun)
	 * 
	 * 1. Adým : Kullanýcýdan sayý alalým.
	 * 2. Adým : Sayýyý onlar, yuzler, binler basamaðýna bölelim.
	 * 3. Adým : Switch case ile her sayý için, o sayýya denk gelen okunuþu gösterelim.
	 * 		örnek : yüzler basamaðýndaki 1 için, yüzler
	 * 		örnek : onlar basamaðýndaki 7 için yetmiþ gibi. 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen okunuþunu öðrenmek istediðiniz sayýnýn ");

        int sayi   = scan.nextInt();
        int yuzler = sayi/100;
        int onlar  = (sayi-yuzler*100)/10;
        int birler = (sayi-yuzler*100)-(onlar*10);    ///// burayý anlamayanlar için aþaðýdakini anlatabilirsin
        
        											/*int birler1 = sayi % 10;
        											sayi = sayi / 10;
        											int onlar1 = sayi % 10;
        											sayi = sayi / 10;
        											int yuzler1 = sayi;*/
        oku(yuzler, onlar, birler);
        
		
	}
	
    public static void oku(int yuzler, int onlar, int birler) {
        
        switch(yuzler) {
            case 1: System.out.print("yüz "); break;
            case 2: System.out.print("ikiyüz "); break;
            case 3: System.out.print("üçyüz "); break;
            case 4: System.out.print("dörtyüz "); break;
            case 5: System.out.print("beþyüz "); break;
            case 6: System.out.print("altýyüz "); break;
            case 7: System.out.print("yediyüz "); break;
            case 8: System.out.print("sekizyüz "); break;
            case 9: System.out.print("dokuzyüz "); break;
            default: break;
        }
        switch(onlar) {
            case 1: System.out.print("on "); break;
            case 2: System.out.print("yirmi "); break;
            case 3: System.out.print("otuz "); break;
            case 4: System.out.print("kýrk "); break;
            case 5: System.out.print("elli "); break;
            case 6: System.out.print("altmýþ "); break;
            case 7: System.out.print("yetmiþ "); break;
            case 8: System.out.print("seksen "); break;
            case 9: System.out.print("doksan "); break;
            default: break;
        }
        switch(birler) {
            case 1: System.out.println("bir "); break;
            case 2: System.out.println("iki "); break;
            case 3: System.out.println("üç "); break;
            case 4: System.out.println("dört "); break;
            case 5: System.out.println("beþ "); break;
            case 6: System.out.println("altý "); break;
            case 7: System.out.println("yedi "); break;
            case 8: System.out.println("sekiz "); break;
            case 9: System.out.println("dokuz "); break;
            default: break;
        }
    }
}
