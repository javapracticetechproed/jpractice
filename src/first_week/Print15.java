package first_week;

import java.util.Scanner;

public class Print15 {
	
	/* Kullan�c�n�n ekrana yazd��� karakterin ASCII tablosuna g�re numaras�n� bulun.
	 * 
	 * 1. Ad�m : Scanner ile nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan sorgulamak istedi�i karakteri yazmas�n� isteyelim.
	 * 3. Ad�m : Ekrana yazd�ral�m.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ASCII tablosunda sorgulamak istedi�iniz karakteri yaz�n�z : ");
		char ch = scan.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("ASCII : " + ascii);
        
        char chTanimlama = (char) 97;
        System.out.println(chTanimlama);

    }

}
