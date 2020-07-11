package jpractice;

import java.util.Scanner;

public class switch_case_read_anumber {
	/*
	 * Soru: Klavyeden girilen herhangi bir say�n�n, okunu�unu ekrana yazd�r�n�z. 
	 * (max yaz�labilecek say� 999 olsun)
	 * 
	 * 1. Ad�m : Kullan�c�dan say� alal�m.
	 * 2. Ad�m : Say�y� onlar, yuzler, binler basama��na b�lelim.
	 * 3. Ad�m : Switch case ile her say� i�in, o say�ya denk gelen okunu�u g�sterelim.
	 * 		�rnek : y�zler basama��ndaki 1 i�in, y�zler
	 * 		�rnek : onlar basama��ndaki 7 i�in yetmi� gibi. 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen okunu�unu ��renmek istedi�iniz say�n�n ");

        int sayi   = scan.nextInt();
        int yuzler = sayi/100;
        int onlar  = (sayi-yuzler*100)/10;
        int birler = (sayi-yuzler*100)-(onlar*10);    ///// buray� anlamayanlar i�in a�a��dakini anlatabilirsin
        
        											/*int birler1 = sayi % 10;
        											sayi = sayi / 10;
        											int onlar1 = sayi % 10;
        											sayi = sayi / 10;
        											int yuzler1 = sayi;*/
        oku(yuzler, onlar, birler);
        
		
	}
	
    public static void oku(int yuzler, int onlar, int birler) {
        
        switch(yuzler) {
            case 1: System.out.print("y�z "); break;
            case 2: System.out.print("ikiy�z "); break;
            case 3: System.out.print("��y�z "); break;
            case 4: System.out.print("d�rty�z "); break;
            case 5: System.out.print("be�y�z "); break;
            case 6: System.out.print("alt�y�z "); break;
            case 7: System.out.print("yediy�z "); break;
            case 8: System.out.print("sekizy�z "); break;
            case 9: System.out.print("dokuzy�z "); break;
            default: break;
        }
        switch(onlar) {
            case 1: System.out.print("on "); break;
            case 2: System.out.print("yirmi "); break;
            case 3: System.out.print("otuz "); break;
            case 4: System.out.print("k�rk "); break;
            case 5: System.out.print("elli "); break;
            case 6: System.out.print("altm�� "); break;
            case 7: System.out.print("yetmi� "); break;
            case 8: System.out.print("seksen "); break;
            case 9: System.out.print("doksan "); break;
            default: break;
        }
        switch(birler) {
            case 1: System.out.println("bir "); break;
            case 2: System.out.println("iki "); break;
            case 3: System.out.println("�� "); break;
            case 4: System.out.println("d�rt "); break;
            case 5: System.out.println("be� "); break;
            case 6: System.out.println("alt� "); break;
            case 7: System.out.println("yedi "); break;
            case 8: System.out.println("sekiz "); break;
            case 9: System.out.println("dokuz "); break;
            default: break;
        }
    }
}
