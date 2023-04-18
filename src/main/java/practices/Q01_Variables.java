package practices;

import java.time.Year;

public class Q01_Variables {

    public static void main(String[] args) {

        //Bir variable baslat.
        int age = 15;
        int number = 43;
        String isim = "Ali";

        System.out.println(age);
        System.out.println("number=" + number);
        System.out.println("isim = " + isim);

        //cntrl +d aynisini alır bir sonraki satira kopyalar.
        //number. (soutv) seciyorsun, kısa şekilde etiketiyle yazıyor.


        //Variable degerini kopyala.
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Aynı satırda çoklu variable deklere et.
        int year = 2022, month = 5, day = 15, hour = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Bir variable degerini güncelle.
        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //bir variable deklere et : x
        double x;

        // bir variable baslat : y
        double y = 55.6;

        //başka bir variable başlat : z
        double z = 10;

        //x degişkenini y değişkeni ile başlat
        x = y;

        //variable'ı güncelle
        x = 15.3;

        //değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
