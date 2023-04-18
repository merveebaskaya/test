package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {

    public static void main(String[] args) {

       /*
       Kullanicidan email adresini girmesini isteyin,
    Asagidaki kurallara gore kullanicinin
    girdigi email adresini kontrol ediniz.
           i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmali
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                        " i)mail adresi \"@gmail\" icermeli\n" +
                        " ii)Space characteri mail'de olmamali\n" +
                        "iii)mail adresinde buyuk harf olmamali\n" +
                        " iv)En az bir tane noktalama " +
                "isareti bulunmali \n seklinde veriniz");

        String mail = input.nextLine();

        //i)mail adresi "@gmail" icermeli

        boolean first= mail.contains("gmail");
        System.out.println("gmail icermeli = " + first);



        //ii)Space characteri mail'de olmamali

        boolean second = !mail.contains(" ");
        System.out.println("space = " + second);

        //iii)mail adresinde buyuk harf olmamali

        /*boolean third = mail.contains("[A-Z]");
        System.out.println("third = " + third);
        contains() methodu Regex karakterlerle calişmaz.Bu nedenle
                replaceAll()ya da replace() ile silme
                yapıp geriye kalanların lenght() ne bakilir.

         */
       /* boolean upperCaseNot = mail.replaceAll("[^A-Z]","").length()==0;
        System.out.println("upperCaseNot = " + upperCaseNot );*/

        boolean third = mail.replaceAll("[a-z0-9]","").
                             replaceAll("[\\p{Punct}]","").
                             replace(" ","").length()==0;
        System.out.println("Buyuk Harf Olmamali = " + third);

        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").
                replace(" ","").
                length()>0;


       // boolean fourth2 = mail.replaceAll("^\\P{P}","").length()>0;
       //boolean fourth1 = mail.replaceAll("[\\P{P}]",""); Semboller hariç hepsini sil.
        System.out.println("Noktalama Isareti Olmali = " + fourth);
        System.out.println(first&&second&&third&&fourth);
        /*
        Noktalama Isaretleri :
       18 noktalama işareti var. Bunlar; nokta, virgül, noktalı virgül, iki nokta,
       üç nokta, soru işareti, ünlem işareti, kısa çizgi, uzun çizgi, eğik çizgi, ters eğik çizgi,
       tırnak işareti, tek tırnak işareti, denden işareti, yay ayraç, köşeli ayraç, kesme,@
         */

        String str = "burada bir gariplik var.?-!";
        System.out.println(str.replaceAll("[\\P{P}]",""));
        System.out.println(str.replaceAll("[^\\p{P}]",""));


    }//main
}//class
