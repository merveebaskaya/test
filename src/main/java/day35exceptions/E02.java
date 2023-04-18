package day35exceptions;

import java.util.Map;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java", 2));

        System.out.println(getCharFromString("Java", 8));


    }
    //Example 1: BirString'deki characteri index kullanarak alan bir method olusturunuz.
    public static char getCharFromString(String str, int idx){

        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){

            idx = Math.abs(idx);

            idx = idx%str.length();

           return str.charAt(idx);
        }



    }

}
