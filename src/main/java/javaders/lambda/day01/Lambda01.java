package javaders.lambda.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
     /*
     1)Lambda method create etme degil mevcut methodlari libraryden cagirip kullanmaktir.
     2)Java 8 ile eklenmistir.
     3)Functional Programming dir. mimari yapiya onem vermez
     4)Hiz, Clean Code ve okunabilirlik acisindan onemlidir.
      */

        List<String>iller = new ArrayList<>(Arrays.asList("VAN","Edirne","Ordu","VAN","Izmir","Eskisehir","Safranbolu","Izmir","MUS"));
        printElements(iller); //VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println();
        printsEl(iller);
        System.out.println();
        eHaricElemanlariYazdir(iller); //VAN Ordu VAN Izmir Safranbolu Izmir MUS
        System.out.println();
        karakterSayisiDorttenAzOlanlariYazdir(iller);
        System.out.println();
        karakterSayisiDorttenCokBuyukBuyukHafleYazdir(iller);
        System.out.println();
        karakSaysDorttenCokOTkrzKucukHrfYazdir(iller);
        System.out.println();
        tkrszBuyukHrfAlfabetikSireYazdir(iller);
        System.out.println();
        tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(iller);
        System.out.println();
        ilkHrfBykDigerKucukYazdir(iller);
        System.out.println();
        System.out.print(ilkHarfEveSOlanlariYazdir(iller));

    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:Structured Programming
    public static void printElements(List<String> iller){

        for (String w : iller){
            System.out.print(w +" ");
        }

    }

    //2.Yol:LAMBDA
    public static void printsEl(List<String>iller){
        System.out.print("1) ");
        iller.
                stream().//datalari akisa aliyor
                forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void eHaricElemanlariYazdir(List<String>iller){
        System.out.print("2) ");
        iller.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t + " "));
    }


    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenAzOlanlariYazdir(List<String>iller){
        System.out.print("3) ");
        iller.
                stream().
                filter(t->t.length()<4).
                forEach(t-> System.out.print(t + " "));
    }


    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakterSayisiDorttenCokBuyukBuyukHafleYazdir(List<String>iller){
        System.out.print("4) ");
        iller.
                stream(). //akisa alindi
                filter(t->t.length()>4). //karakter sayisi 4'ten fazla olanlar filtrelendi
                map(t->t.toUpperCase()). //datalarin yapisini degistir
                forEach(t-> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenCokOTkrzKucukHrfYazdir(List<String>iller){
        System.out.print("5) ");
        iller.
                stream().
                distinct(). //benzersiz tekrarsiz
                filter(t->t.length()>4).
                map(t->t.toLowerCase()). //datanin yapisini degistirdi
                forEach(t-> System.out.print(t +" "));

        /*
        sorted()==>2 turlu kullanimi vardir.Icerisinde arguman verilmezse,burada oldugu gibi
         i)sorted() natural order'a gore kucukten buyuge siralama yapar.
         ii)sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar.
         */
    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void tkrszBuyukHrfAlfabetikSireYazdir(List<String>iller){
        System.out.print("6) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t +" "));
    }


    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(List<String>iller){
        System.out.print("7) ");
        iller.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())). //Comparator karsilastirici comparing karsilastir uzunluklarina gore
                forEach(t-> System.out.print(t +" "));
        //sorted(Comparator.comparing(t->t.length())) karsilastirma sartlarini biz belirliyorsak
        //sorted() icerisine Comparator le sartimizi belirtiriz.
        //Eger listede kiyas sirasinda ayni sartlar varsa listeye once eklenen once yazdirilir.
    }

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    public static List<String> ilkHrfBykDigerKucukYazdir(List<String >iller){
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t + " "));
        return iller;
    }
    // Example 9: Ilk harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz.
    public static List<String> ilkHarfEveSOlanlariYazdir(List<String>iller){
        System.out.print("9) ");
        return iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList()); // bir akisin sonuclarini bir list icinde toparlamak icin kullanilir.

    }






}
