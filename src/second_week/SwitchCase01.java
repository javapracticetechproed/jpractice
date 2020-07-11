package second_week;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		// Kullanýcýda 2 sayý alamlým
		//Kullanýcýdan 4 islemden birini secsin 
		//sonucu yazdýralým
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		double num1 = input.nextDouble();
		System.out.println("Lutfen 2. sayiyi giriniz");
		double num2 = input.nextDouble();
		System.out.println("Lutfen isleminizi seciniz: \n1-toplama\n2-cikartma\n3-bolme\n4-carpma");
		String islem = input.next();
		switch (islem) {
		case "1":
			System.out.println("Toplama isleminin sonucu: " + (num1+num2));
			break;
			
		case "2":
			System.out.println("Cikartma isleminin sonucu: " + (num1-num2));
			break;
		case "3":
			System.out.println("Bolme isleminin sonucu: " + (num1/num2));
			break;
		case "4":
			System.out.println("Carpma isleminin sonucu: " +(num1*num2));
			break;
			default:
				System.out.println("Hatalý islem sectiniz");
			
		}
		
		input.close();

	}

}
