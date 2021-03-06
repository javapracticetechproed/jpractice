package jpractice;

import java.util.ArrayList;
import java.util.List;

public class forloop_nested_find_dublicate_characters {
	/*
	 * Kullanc�dan ald���m�z metindeki tekrar eden harfleri bulan program yaz�n�z.
	 * 
	 * 1. Ad�m : Kullan�c�dan bir metin girmesini isteyelim.
	 * 2. Ad�m : T�m harfleri, di�er harflerle kar��la�t�ral�m.
	 * 		Bunun i�in i� i�e ge�mi� for loop lar kullanal�m.
	 * 3. Ad�m : ��teki for loop'un i�erisinde harfleri kar��la�t�ral�m.
	 * 		E�er e�itlik varsa, tekrar ediyor demektir. Ekrana yazd�ral�m.
	 * 
	 * �pucu : Tekrar eden harfleri ekrana yazd�r�rken birka� kere yazd�rmamak i�ini 
	 * 			bir tane List<Character> oncedenBulunanHarfler olu�turun ve buldu�unuz harfleri i�ine at�n.
	 * 		   E�er harf zaten ekrana yazd�r�lm��sa, ekrana yazd�rmay�n.
	 * 
	 * �pucu 2 : Bo�luk " "  karakterini ekrana yazd�rmamak i�in  (harf != ' ') e�er bo�lu�a e�it de�ilse 
	 * 			ko�ulunu kullanabilirsiniz.
	 * 
	 * */
	
    public static void main(String[] args) {
    	
       List<Character> oncedenBulunanHarfler = new ArrayList<>();
       String str = new String("Tekrar eden harfleri bulal�m");
       
       
       char[] chars = str.toCharArray();
       System.out.println("Tekrar eden harfler �unlard�r :");
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
