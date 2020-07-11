package second_week;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// Kullanýcýda 4 islemden birisini seçtirelim
		// toplama,cikartma, carpma,bolme
		// 2 sayý girsin.
		//sonucu yazdýralým.
		// toplama 5, 6  "Toplama isleminin sonucu: 5+6 = 11"
		// Toplama 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen isleminizi seciniz. \ntolpama\ncikartma\ncarpma\nbolme");
		String islem = input.next();
		System.out.println("Lutfen iki sayi giriniz");
		double num1 =input.nextDouble();
		double num2 = input.nextDouble();
		
		if(islem.equalsIgnoreCase("toplama")) {
			System.out.println("Toplama isleminin sonucu: " + num1+"+"+num2+"="+(num1+num2));
		}else if (islem.equalsIgnoreCase("cikartma")) {
			System.out.println("Cikartma isleminin sonucu: " + num1+"-"+num2+"="+(num1-num2));
			
		}else if (islem.equalsIgnoreCase("carpma")) {
			System.out.println("Carpma isleminin sonucu: " + num1+"x"+num2+"="+(num1*num2));
		}else if (islem.equalsIgnoreCase("bolme")) {
			System.out.println("Bolme isleminin sonucu: " + num1+"/"+num2+"="+(num1/num2));
		}else {
			System.out.println("Hatali secim");
		}
		
		String str1 = "Java";
		String str2 = "JAVA";
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		
		
		
		
		
	}

}
