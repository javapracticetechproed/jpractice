package first_week;

import java.util.Scanner;

public class Print09 {

	/* V�cut kitle indeksini hesaplayan bir program yaz�n�z.
	 * 
	 * 1. Ad�m : Scanner ile nesne �retelim.
	 * 2. Ad�m : Kullan�c�dan boyunu alal�m. (float)
	 * 3. Ad�m : Kullan�c�dan kilosunu alal�m. (float)
	 * 4. Ad�m : Kullan�c�n�n boyunun karesini alal�m.
	 * 5. Ad�m : Kullan�c�n�n kilosunu, boyunun karesine b�lelim.
	 * 6. Ad�m : Ekrana yazd�ral�m.
	 * 
	 */
	
	// �pucu : V�cut Kitle �ndeksi (VK�) = V�cut A��rl��� (kg.) / Boy uzunlu�unun karesi (m.)
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen boyunuzu yaz�n�z (metre): ");
		float boy = scan.nextFloat();
		
		System.out.println("L�tfen kilonuzu yaz�n�z (kilogram): ");
		float kilo = scan.nextFloat();
		
		float boyKare = boy * boy;
		
		float vucutIndeksi = kilo / boyKare;
		
		System.out.println(vucutIndeksi);
		

	}
	

}
