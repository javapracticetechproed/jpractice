package jpractice;

public class forloop_nested_multiplication_table {


	
	
	/* �� i�e for d�ng�leri kullanarak �arp�m tablosunu ekrana yazd�r�n�z. 
	 * 1. Ad�m : 1'den 9'a kadar t�m say�lar� g�zden ge�irmek i�in for d�ng�s� olu�tur.
	 * 2. Ad�m : Her g�zden ge�irilen say� i�in 1'den 10'a kadar t�m say�larla �arp ve ekrana yazd�r.
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		carpimTablosuYazdir();
	}
	
	
	public static void carpimTablosuYazdir() {
		for(int i = 1 ; i <= 9 ; i++) {
			
			for(int k = 1 ; k <= 10 ; k++) {
				System.out.println(i +" x " + k + " = " +(i*k));
			}
					
			System.out.println("\n");
		}
	}
	
}
