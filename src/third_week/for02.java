package third_week;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
	//Kullanýdan bir sayý alalým ve 1 den 10 kadar olan carpimlari yazdiralim
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = input.nextInt();
		
		for(int i =1; i<=10;i++) {
//			for (int j = 1; j <=10; j++) {
//								//2		x	1	10
//				System.out.println(i + "x" + j +"=" + (i*j));
//				
//				
//			}
		//	System.out.println("====================");
			System.out.println(i + "x"  + num + "=" + i*num);
			
			
		}

	}

}
