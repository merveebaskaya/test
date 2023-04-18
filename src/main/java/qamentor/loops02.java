package qamentor;

import java.util.Scanner;

public class loops02 {
    public static void main(String[] args) {

        // Kullanicidan alinan bir tekrarsiz rakamlarinin toplamini bulunuz.
        //1838 ==>1+3=4
        //String s = "1838"; kullanıcı olmazsa böyle yazacağız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        String s = input.next();
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            String d = s.substring(i,i+1);
            if (s.indexOf(d)==s.lastIndexOf(d)){
                sum = sum + Integer.valueOf(d);
            }
        }
        System.out.println(sum);

        System.out.println();

        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz
        //Alabala ==> la

        String t = "Alabala";
        String result= "";
        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if ((t.indexOf(ch)!= t.lastIndexOf(ch))&& !result.contains(""+ ch)){
                     result = result + ch;
            }
        }
        System.out.println(result);



    }



}
