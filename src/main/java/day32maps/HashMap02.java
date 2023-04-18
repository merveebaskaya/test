package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {
        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        //(Verilen cumledeki kelimelerin) gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!" => I=1, like=3, you=1

        String s = "I like you, like like!";

        //like ile like! ayni yapabilmek icin tum noktalama isaretlerini silelim.
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s); //I like you like like

        //Ben kelimelerler calismaliyim bu yuzden split(" ") kullanacagım.
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, you, like, like]

        HashMap<String, Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'te var mı yok mu kontrol edilecek
        //"words" arrayindeki kelimeler Map'de yoksa Map'a value'su 1 olarak yerlersirilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'a varolan value'su 1 arttirilarak yerlersirilecek.

        for (String w : words) {

            Integer numOfOccurrence = occ.get(w);

            if (numOfOccurrence==null){

                occ.put(w,1);

            }else {
                occ.replace(w, numOfOccurrence+1);
            }

        }
        System.out.println(occ); //{like=3, I=1, you=1}



    }
}
