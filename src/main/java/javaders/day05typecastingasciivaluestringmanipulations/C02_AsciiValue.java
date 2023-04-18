package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {
        /*
        Javada char data tipini matematiksel islemlerde kullanirsaniz
        Ascii table'daki sayisal degerleri alir.

        Numeric data typelari: byte-short-int-long-float-double
        char karakterin hem sayisal deger barindirir. hemde resim
        karakteri barindirir.
        boolean ===> Numeric olmayan Data Type tir.
        Java da char data type ine int deger de atanabilir Sembol Harf vs de
        atanabilir cunku char data type inin ascii den gelen bir numeric bir
        degeri bir de resim karakteri vardir.


         */

        //'A' karakterinin Ascii degerini hesaplatan kodu yaziniz.

        int asciiA = 'A';
        System.out.println(asciiA); //65

        int asciia = 'a';
        System.out.println("asciia = " + asciia); //asciia = 97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//asciiUnlem = 33

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//asciiSpace = 32

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//asciiSembol = 42
        String isim = "Zeki";
        char ch = 'Z';
        char sembol = '*';
        char isaret = '?';
        char space = ' ';
        char rakam = '9';
        char sayi = '0';
        //int intCh=Z;

        //149.9999TL * 2
        int deger = 20;
        char smbl = '$';

        System.out.println(deger + smbl); //$ Ascii tablodaki degeri 36 +20=56


        int deger2 = 0;
        char smbl2 = '+';
        System.out.println("deger2+smbl2 = " + deger2 + smbl2);//0+
        System.out.println("deger2+smbl2 = " + (deger2 + smbl2)); //43

        String name = "123";
        int number = 45;
        System.out.println(name + number); //12345 Concatination uc uca eklama yan yana yazdirma

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        System.out.println(str1 + str2 + sayi1); //JavaGuzel5

        int asciiG = 'G';
        System.out.println("asciiG = " + asciiG); //71

        String str = "JAVA";
        char ch3 = 'G';
        int sayi3 = 5;
        System.out.println(str + ch3 + sayi3);//JAVAG5
        System.out.println(str + (ch3 + sayi3)); //JAVA76

        System.out.println(ch3 + sayi3 + str); //76JAVA

        String sayiStr = "123";
        String sayiStr2 = "45";
        System.out.println(sayiStr + sayiStr2);//12345

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1); //1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);//1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +
                (rakam1 + rakam2 + rakam3 + rakam4)); //202 ASCİİ TABLE DAKİ RAKAMLARİN KARŞILIGI
        System.out.println(rakam1 + rakam2 + rakam3 + rakam4); //202

        //1==>Ascii 49     2==>50    3==>51    4==>52
        //*******Ascii Degerlerinden Faydalanilarak Neler Yapilabilir?********

        byte b = 5;
        char ch2 = 'h';

        int asciih ='h';
        System.out.println("asciih = " + asciih); //104
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5); //53

        System.out.println("b > ch2 =" +(b>ch2)); //false 5>104 oluyor false

        long l=5422168784578L;
        System.out.println("ch2>l ="+(ch2>l));//false

        float f = 2.45648f;
        double d = 2.19658;
        System.out.println("f>d ="+(f>d)); //true

        System.out.println("b<f ="+(b<f)); //false
        byte sayi5=5;
        byte sayi6=6;
        System.out.println("sayi5<sayi6 :" +(sayi5<sayi6));//true

        int sayiInt =100;
        long sayiLong = 100L;
        System.out.println("sayiInt<sayiLong :"+(sayiInt<sayiLong));//false
        System.out.println("sayiInt<sayiLong :"+(sayiInt==sayiLong));//true
        int sayiInt2 = 200;
        System.out.println("sayiInt2>=sayiLong :"+(sayiInt2>=sayiLong)); //true
        int sayiInt3 = 9;
        char sayiChar ='9';
        System.out.println("sayiInt3>=sayiChar :"+(sayiInt3>=sayiChar)); //false

       /* String str3 = "Alpay";
        String str4 = "Melih";
        System.out.println("str3>str4 :"+(str3>str4));
        kıyaslanacak numeric bir data değilse kıyaslama yapmaz.
        */



    }//main

}//class
