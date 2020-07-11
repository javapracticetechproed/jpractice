package second_week;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		// Kullanýcýdan meslegini isteyelim
		// meslegi = qa ==> Quality Analyst
		//           dev ==> Developer
		//			 ba ==> Busines Analyst
		//			 pm ==> Project Manager
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen mesleginizi giriniz \nqa\ndev\nba\npm");
		String jobTitle=input.next();
		
		String qa="Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";
		
		if(jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz: " + qa);
			
		}else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("Mesleginiz: " + dev);
		}else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("Mesleginiz: " + ba);
		}else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz: " + pm);
		}else {
			System.out.println("Hatali secim yaptiniz");
		}
		
		input.close();
		
		
	}

}
