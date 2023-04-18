package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        System.out.println(sortWithLastCharDistinctUpperIntList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));


    }
    //Example1:List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir listin icinde return ediniz.
    //[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]

    public static List<String> sortWithLastCharDistinctUpperIntList(List<String>names) {
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList()); //Normalde distinct elemanlari depolamak icin set kullanilir ama
        //lambda da ki  collect(Collectors.toSet()) methodu elemanlarini rastgele siralar
        //halbuki bu soruda rastgele siralamak kabul edilmiyor.Bu yuzden mecburen collect(Collectors.toList()) kullandik.


    }


    //Example 2: List elemanlarini character sayilarina gore ters siradan kucuk harfle bir list icinde return ediniz.
    //Ayni karakter sayisina sahip elemanlar kendi icinde alfabetik sirada olsun.
    //[Tom, Alex, Jim, Michael, Mary, Alexander, Alex]==>[Alexander, Michael, Alex, Alex, Mary, Jim, Tom]
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String>names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());

    }

    //Example 3:List elemanlariniN tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String>names){
        return names.
                stream().
                allMatch(t->t.length()>2);
    }

    //Example 4:List elemanlarinin hicbirinin character sayisinin 3 den kucuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean noLengthLessThanThree(List<String>names){
        return names.stream().noneMatch(t->t.length()<3);
    }

    //Example 5:List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden methodu olusturun
    public static boolean atLeastOneLengthLessThanFour(List<String>names){
        return names.
                stream().
                anyMatch(t->t.length()<4);
    }



}
