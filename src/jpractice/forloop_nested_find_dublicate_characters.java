package jpractice;

import java.util.ArrayList;
import java.util.List;

public class forloop_nested_find_dublicate_characters {
	/*
	 * Kullancýdan aldýðýmýz metindeki tekrar eden harfleri bulan program yazýnýz.
	 * 
	 * 1. Adým : Kullanýcýdan bir metin girmesini isteyelim.
	 * 2. Adým : Tüm harfleri, diðer harflerle karþýlaþtýralým.
	 * 		Bunun için iç içe geçmiþ for loop lar kullanalým.
	 * 3. Adým : Ýçteki for loop'un içerisinde harfleri karþýlaþtýralým.
	 * 		Eðer eþitlik varsa, tekrar ediyor demektir. Ekrana yazdýralým.
	 * 
	 * Ýpucu : Tekrar eden harfleri ekrana yazdýrýrken birkaç kere yazdýrmamak içini 
	 * 			bir tane List<Character> oncedenBulunanHarfler oluþturun ve bulduðunuz harfleri içine atýn.
	 * 		   Eðer harf zaten ekrana yazdýrýlmýþsa, ekrana yazdýrmayýn.
	 * 
	 * Ýpucu 2 : Boþluk " "  karakterini ekrana yazdýrmamak için  (harf != ' ') eðer boþluða eþit deðilse 
	 * 			koþulunu kullanabilirsiniz.
	 * 
	 * */
	
    public static void main(String[] args) {
    	
       List<Character> oncedenBulunanHarfler = new ArrayList<>();
       String str = new String("Tekrar eden harfleri bulalým");
       
       
       char[] chars = str.toCharArray();
       System.out.println("Tekrar eden harfler þunlardýr :");
       for (int i=0; i<str.length();i++) {
           for(int j=i+1; j<str.length();j++) {
              if (chars[i] == chars[j]) {
                         
            	  if(chars[j] != ' ' && !oncedenBulunanHarfler.contains(chars[j]))
            	  {
            		  oncedenBulunanHarfler.add(chars[j]);
            		  System.out.println(chars[j]);
                      break;
            	  }
               }
            }
        }
    }
}
