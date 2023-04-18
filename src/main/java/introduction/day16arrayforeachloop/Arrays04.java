package introduction.day16arrayforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        //ornek 2:Size verilen bir cumlede kac harf oldugunu harflere ayirarak gosteren kodu yaziniz.
        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
                     //JavaiseasyLearnJavaearnmoney
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);//28

        //System.out.println(s.replaceAll("[^a-zA-Z]", "").length()); harfleri ayirmasak bununla bulabilirdik.





    }
}
