package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {


   /*
   Kullanicidan data almak icin scanner classindan
   scan/input/scanner objesi olusturuyoruz.
   Bu sekilde kullaniciyi yönlendirerek gerekli
   datalari elde ederiz.

    */

        //1. adim obje olusturma
        Scanner input = new Scanner(System.in);// input objesi


        //2. adim kullaniciya ne yapacagini soyluyorduk.
        System.out.println("Lutfen cinsiyetinizi giriniz K/E seklinde");

        //3. adim kullanicidan alinan data yapisina buyuklugune uygun bir Variable in icine yerlestirilir
        char cinsiyet = input.next().charAt(0);

        //4. adim ekranda görebilmek icin ve kullanicininda verdigi bilgileri
        // teyit edebilmesi icin yazdiriyoruz.
        System.out.println("cinsiyet : " + cinsiyet);


        //kullaniciya cinsiyetini adini memeleketini yasını boyunu ülkesini sevip sevmedigini maasini soran bir program yaziniz.
        Scanner input2 = new Scanner(System.in); //input2, baska biri
        System.out.println("Lutfen cinsiyetinizi giriniz kadin ise K erkek ise E harfi giriniz"); //kisi gördü
        char gender = input2.next().charAt(0); //gender==cinsiyet

        System.out.println("Lutfen adinizi giriniz");
        String isim = input2.next();

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket = input2.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = input2.nextShort();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi yaziniz True/False olarak");
        boolean seviyorMu = input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("*************Gonul Hanim**************");
        System.out.println("gender : " + gender + "\nisim : " + isim + "\nmemleket : " + memleket + "\nyas : " + yas + "\nboy : " + boy + "\nseviyorMu :" + seviyorMu + "\nmaas :" + maas);


    }//main
}//class
