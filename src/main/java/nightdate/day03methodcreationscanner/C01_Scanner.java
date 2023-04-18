package nightdate.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

         /*kullanicidan data almak icin scanner class i kullanılır.
    ve bir input/scan/scanner objesi olusturulur.
    bu objeyi new key wordyule olusturunuz.
     */
      //1-adim object olusturma
        Scanner  input = new Scanner(System.in); //Tolgahan
      //2- kullaniciya ne yapacagını soruyoruz
        System.out.println("Lutfen maasinizi giriniz");
      //3-adim kullanicidan alınan datalar yapısına ve büyüklügüne göre
      //bir variable a yerlestirilir.
      long maas = input.nextLong();
      //4-kullanicinin verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz
        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lutfen cinsiyetinizi kadin ise K erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);//erkek
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("Lutfen adinizi giriniz");
      //  String isim = input.next();
        input.nextLine();// dummy satır atlamasi yapmamasi icin
        String name = input.nextLine();//tolgahan mete

      //  System.out.println("isim = " + isim);
      //  System.out.println("name = " + name);
        System.out.println("Lütfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("Lutfen yasınızı giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen ulkenizi seviyor musunuz seyiyorsaniz true sevmiyorsaniz false yaziniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("*************Tolgahan************");
        System.out.println("cinsiyet = " + cinsiyet+"\nname = " + name+ "\nmemleket = " + memleket +"\nyas = " + yas +"\nboy = " + boy +"\nseviyorMu = " + seviyorMu);


    }//main




}//class
