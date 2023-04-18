package day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));
        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));
        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMİnGreaterThanEight(nums));

    }


    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){

        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);


    }
    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){

        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare). // Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                                       // ihtiyacınız olan methodu olusturunuz ve Method Reference kullaniniz.
                reduce(0, Math::addExact); //Class Ismi :: Method Ismi ==> Method Reference methoda atıfta bulunuyorum adres gosteriyorum


    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){

        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get(); //get() method'u Optional<Integer> i Integer'a cevirir


    }


    //Example 2:Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1,(t,u)->t*u);

        //Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi.
    }


    //Example 3:Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    //toplamini hesaplayan methodu olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get(); //reduce u optional data type i normal data type yapar.

        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u ? t : u).get();

        return maxEven + minOdd;
    }

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri tek sayi olan elemanlarin
    //8 den buyuk minimum degerinin toplami.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMİnGreaterThanEight(List<Integer> nums){
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t : u).get();
        return max + min;
    }



}
