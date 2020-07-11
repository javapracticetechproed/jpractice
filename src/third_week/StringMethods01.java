package third_week;

public class StringMethods01 {

	public static void main(String[] args) {
	//indexOf() Karakterin yerini belirler
		String str= "istanbullu";
		System.out.println(str.indexOf('u'));
	//last indefxof() methodu aradigimiz karakterin string icerisindeki 
	//son gorunumun index ini verir
		System.out.println(str.lastIndexOf('l'));
		
		//lenght() Stringin uzunlugunu verir Saymaya 1 den baslar.
		//Kullanicini  ismini alalým ve ilk harfi ile son harfini yer degistirelim.
		System.out.println(str.length());
		
		char ilkHarf= str.charAt(0);
		char sonHarf = str.charAt(str.length()-1);
		System.out.println(sonHarf);
		
		System.out.println(sonHarf +str.substring(1,str.length()-1)+ilkHarf); //[ , )
		
		
		//contains() Strig icerisinde aranan karakter var ise true yok ise false doner.
		
		System.out.println(str.contains("iz"));//false
		System.out.println(str.contains("bul"));//true
		
		//isEmpty String icinde karakter yok ise true verir. Herhangi bir bosluk dahi olsa 
		// false doner.
		
		String str1 =""; 
				System.out.println(str1.isEmpty());
				
		// trim()  Stringin bas ve sonunadki bosluklari siler.
				String str2 ="  ankara istanbul  ";
				System.out.println(str2);
				System.out.println(str2.trim());
		//starsWith() istenen harf ile baslayip baslamadigini kontrol eder.
				//istenen harf ile basliyor ise true degilse false doner
				
				System.out.println(str.startsWith("A")); //false
		//endsWith() istenen harf ile bilip bitmedigini kontrol eder.
				
		//substring() methodu stringin belli bir kismini almamizi saglar.
				 System.out.println(str.substring(4)); //istanbullu
				 System.out.println(str.substring(2,8)); //[,)
				System.out.println(str.indexOf('t'));
		
		//concat() iki stringi birlestirir
				System.out.println(str.concat(str2).concat(str));
				System.out.println(str);
				System.out.println(str+str2);
				
		//replace() stringde istenen karakterin baska bir karakterle degistirilmesini saglar.
				System.out.println(str.replace("i", "I"));
				System.out.println(str.replace("u", "I"));
		//replaceFirst() stirindeki ilk karakteri degistirir
				System.out.println(str.replaceFirst("u","Y"));
				
		//valueOf() rakamlarla olusturulan stringleri sayiya donusturur
		//		1.stringleri sayiya donusturur Integer.valueof(String)
				
		//     2.inteer olan sayiyi Stringe cevirir  String.valueof(int)
				
				
				String  para1 ="1900";
				String  para2 = "2500";
				System.out.println(para1 + para2); //19002500
				System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));
				int num1=100;
				int num2 = 200;
				System.out.println(String.valueOf(num1)+String.valueOf(num2));
				
				
						
	}

}
