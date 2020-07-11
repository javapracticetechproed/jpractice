package jpractice;

public class forloop_nested_multiplication_table {


	
	
	/* Ýç içe for döngüleri kullanarak çarpým tablosunu ekrana yazdýrýnýz. 
	 * 1. Adým : 1'den 9'a kadar tüm sayýlarý gözden geçirmek için for döngüsü oluþtur.
	 * 2. Adým : Her gözden geçirilen sayý için 1'den 10'a kadar tüm sayýlarla çarp ve ekrana yazdýr.
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
