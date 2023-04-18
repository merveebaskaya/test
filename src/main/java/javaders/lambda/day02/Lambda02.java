package javaders.lambda.day02;

import javaders.lambda.day03.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Lambda02 {
    public static void main(String[] args) {




        List<String > iller = new ArrayList<>(Arrays.asList("Van","Gumushane","MUS","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));
        bykHrfLenghtArtanSiradaTkrsz(iller);
        System.out.println();
        bykHrfSonHarflerineGoreArtanSiradaTkrsz(iller);
        System.out.println();
        bykHrfUzunlarinaGoreArtanSiradaTkrszAyniAlfabetikSira(iller);
        System.out.println();
    //    System.out.println(karakterSysi5tenFazlaElSil(iller));
    //    System.out.println(hIleBaslayanYadaUileBitenElSil(iller));
        System.out.println(elKarakterSayilarininKareleriniAl(iller));
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanSiradaTkrsz(List<String>iller){
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarflerineGoreArtanSiradaTkrsz(List<String>iller){
        System.out.print("2) ");
    iller.
            stream().
            distinct().
            map(t->t.toUpperCase()).
            sorted(Comparator.comparing(t->t.charAt(t.length()-1))). //son harfine gore aldik.
            forEach(t-> System.out.print(t + " "));
    /*
    forEach(t-> System.out.print(t + " ")); Lambda bu yapiyi sevmez bunu yerine Method Referans yontemini bulmuş.
     */
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfUzunlarinaGoreArtanSiradaTkrszAyniAlfabetikSira(List<String>iller){
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
    /*
    .map(t->t.toUpperCase()) Lambda Expression bu sevilmez bunu yerine .map(String::toUpperCase)
     */

/*
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> karakterSysi5tenFazlaElSil (List<String>iller){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);
        return iller;

    }

    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanYadaUileBitenElSil(List<String>iller){
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;
    }
*/
    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> elKarakterSayilarininKareleriniAl(List<String>iller){
        System.out.print("6) ");
        return iller.
                stream().
                map(Utils::karesiniAl). //Method Reference   //LAMBDA EXPRESSION map(t->t.length() * t.length())
                collect(Collectors.toList());
    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String>iller){
        System.out.print("7) ");
        return iller.
                stream().
                filter(Utils::ciftMi).  //Lambda Expression filter(t->t.length()%2==0)
                collect(Collectors.toList());

    }


    }



