package qamentor;

import java.util.Scanner;

public class Day04Loop {

    public static void main(String[] args) {
         //21den 180 e kadar hem 4 hemde 6 ya bolunebilen sayilari yazdiriniz.

        for (int i = 21; i<181; i++){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 2: Size verilen kucuk harfle yazilmis
        // String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz.
        //ankara==>AKR
        String s = "istanbul";
        for (int i = 0; i<s.length(); i++){
            String ch = s.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();


        //Example 3:Verilen bir String de ilk "a" harfinden onceki tum karakterleri consol'a yazdiriniz.
        //      "I Love Java" ==> "I Love J"
        String a= "Besiktas";
        for(int i =0; i<a.length();i++){
            char b = a.charAt(i);
            if (b=='a'){
                break;

            }
            System.out.print(b);
        }

        System.out.println();

        //Example 2: Verilen bir String ile son 'a' dan sonraki tum karakterleri ters sirada yazdiriniz.
        //"Germany" ==>yn
        String er ="Amerik";
        for (int i=er.length()-1; i>=0; i--){
            char v = er.charAt(i);
            if (v=='a'){
                break;
            }
            System.out.print(v);
        }
        System.out.println();

        // Kullanicidan alinan bir tekrarsiz rakamlarinin toplamini bulunuz.
        //1838 ==>1+3=4
        //String s = "1838"; kullanıcı olmazsa böyle yazacağız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String s1= input.next();
        int sum=0;

        for (int i=0; i<s1.length();i++){
            String s2=s1.substring(i,i+1);
            if (s1.indexOf(s2)==s1.lastIndexOf(s2)){
                sum = sum + Integer.valueOf(s2);
            }
        }
        System.out.println(sum);





    }
}
