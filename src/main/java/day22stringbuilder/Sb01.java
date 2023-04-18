package day22stringbuilder;

public class Sb01 {
    /*
    1)"StringBuilder" String ureten bir class'dir.
    2)"String Class" kullanarak String uretiriz Java nicin Stringbuilder calassi da olusturdu?
      "String Class" "immutable"(degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir) Class uretir
    3)"immutable" olmak demek orjinal degerin korunmasi,degistirilemez olmasi demektir.
      "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
    4)"capacity" Java'nin size verdigi depolama yer sayisidir.
      Lenght ise size verilen data depolama yerinin kullanilan kismidir
    5)Java baslangic olarak size capacit'i 16 olarak verir.
      Siz verilen capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde degistirir.


     */
    public static void main(String[] args) {
        String s = "Java";
        //s + "!";
        s = s + "!";

        String u ="Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur?

        //1.way:
        StringBuilder t = new StringBuilder("Phyton");
        System.out.println(t);//Phyton

        //StringBuilder'lara nasil ekleme yapilabilir?
        t.append("!").append("..");
        System.out.println(t);//Phyton!..

        //2.way:
        StringBuilder r = new StringBuilder();
        System.out.println(r);

        r.append('c');
        System.out.println(r);

        //"capacity" ve "lenght" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();//21
        System.out.println(capacity);

        int lenght = sb1.length();
        System.out.println(lenght);//Money ==> 5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c);//21==>21x2+2=44

        int ln = sb1.length();
        System.out.println(ln);//6==>23

        //Default capacity'i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6




    }
}
