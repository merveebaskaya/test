package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaeSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);


    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElements(List<String> myList){

        for (String w : myList) {
            System.out.print(w + " ");    //Structured Programming(yapısal programlama)
        }
    }

    //2.yol:LAMBDA EXPRESSION
    public static void printEl(List<String> myList) {

        myList.
                stream().//Datalari
                forEach(t-> System.out.print(t + " ")); //yazdirir //Functional programming(fonksiyonlu programlama)

    }

    //Example 2: Bir List'teki Tile baslayanlar haric tum elemanlari console'a yazdiran methodu olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t + " "));
    }

    //Example 3:Bir List'te character sayisi 4'den az olan tum elemanlari console'a yazdiran methodu olusturunuz.
    public static void printElLengthThanFour(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));
    }

    //Example 4:Bir List'te character sayisi 4'den cok olan tum elemanlari buyuk harflerle console'a yazdiran methodu olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t + " "));
    }

    //Example 5:Bir List'te character sayisi 4'den cok olan tum elemanlari tekrarsiz olarak kucuk harflarle console'a yazdiran methodu olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct(). //tekrarsız, tekrarli elemanlari bir kez gösterir
                filter(t->t.length()>4). //eleme yapar filtreler
                map(t->t.toLowerCase()). //yapisini degistirir burada kucuk harf yapiyor
                forEach(t-> System.out.print(t +" "));
    }

    //Example 6:Bir List'teki elemanlari tekrarsiz olarak kucuk harflarle alfabetik sirada console'a yazdiran methodu olusturunuz.
    public static void printElUniqueToUpperCaeSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(). //natural order'a gore siralar
                forEach(t-> System.out.print(t +" "));

        //sorted() methodu natural order olarak calisir.String datalar icin A-Z integer 1-9999 seklinde siraliyor
        //tersten siralama da reverse order dir.
    }
    //Example 7:Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdirin.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct(). //Tekrarsiz yapar
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())). //Comparator.comparing(t->t.length() karsilastirici
                forEach(t-> System.out.print(t +" "));
    }

}
