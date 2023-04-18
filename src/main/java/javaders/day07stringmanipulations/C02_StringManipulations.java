package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {

        /*
        Asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz.

        i) En az 8 karakterden olussun.
        ii)Password space icermesin.
        iii)En az 1 tane buyuk harf olsun.
        iv)En az 1 tane kucuk harf olsun.
        v)En az 1 tane sembol olsun.
        vi) En az 1 tane de rakam olsun.

        pozitif Senaryo ==>Ac123?d.    Password Gecerli mi :true
        Negatif senaryo ==>Ac123? sd   Password Gecerli mi :false

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu" +
                "        i) En az 8 karakterden olussun.\n" +
                "        ii)Password space icermesin.\n" +
                "        iii)En az 1 tane buyuk harf olsun.\n" +
                "        iv)En az 1 tane kucuk harf olsun.\n" +
                "        v)En az 1 tane sembol olsun.\n" +
                "        vi) En az 1 tane de rakam olsun." +
                " giriniz...");
        String pwd = input.nextLine();

        //i) En az 8 karakterden olussun.

        boolean krktrSys = pwd.length()>7;
        //boolean krktrSys2 = pwd.length()>=8; makbul olani >7 dir.
        //cunku javaya daha az is yaptirir.


        //ii)Password space icermesin.

        boolean spaceOlmamali = !pwd.contains(" ");
        //" " ==space karakteri içer contains   !== içermesin


        //iii)En az 1 tane buyuk harf olsun.

        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]", "").length()>0;

        //methodlari ayni satirda yan yana yazabiliriz.Buna method chain(method zinciri) denir.


        //iv)En az 1 tane kucuk harf olsun.

        boolean kckHarfOlmali = pwd.replaceAll("[^a-z]", "").length()>0;

        //v)En az 1 tane sembol olsun. sembol tum harfler tum rakamlar dısındaki hersey

        boolean sembolOlmali = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;

        //vi) En az 1 tane de rakam olsun.

        boolean rakamOlmali = pwd.replaceAll("[^0-9]", "").length()>0;

        System.out.println("Password Gecerli mi :" +(krktrSys && spaceOlmamali
                && bykHrfOlmali && kckHarfOlmali && sembolOlmali &&rakamOlmali));







    }//main
}//class
