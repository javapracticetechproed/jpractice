package second_week;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
	// Kullanýcýdan 3 tene pozitif  tam sayý alalým 
	// bu uc sayidan ucgen olup olmama durumunu kontrol edelim
	// eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim
		// a+b>c>a-b 1
		//a+c>b>a-c  1
		//b+c>a>b-c  1
		//a=b=c es kenar ucgen 
		// sadece ucgen
		//ucgen degildir.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 3 tam sayi giriniz");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c= input.nextInt();
		
		if(a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
			if(a==b &&a==c) {
				System.out.println("ucgen ve eskenar ucgendir");
			}else {
				System.out.println("ucgen fakat eskenar degil");
			}
		}else {
			System.out.println("ucgen degildir.");
		}
		input.close();
				

	}

}
