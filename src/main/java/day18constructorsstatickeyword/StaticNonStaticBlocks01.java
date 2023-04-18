package day18constructorsstatickeyword;

/*
  1)"static block"lar "static variable" lara ilk degerlerini(initialize) atamak icin kullanilir.
  2)"static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static blok kullaniniz.
  3)"static" bir variable'a deger atamak icin yazilmasi gereken kod main methoda da yazilabilir
  "static block'a yazilan kod daha önce calistirilir.
  4)Bir class da birden fazla block varsa üstteki önce calistirilir.
 */

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {
    //static variable'lar static block kullanilmadan da "initialize"edilebilir.

    public static double pi = 3.14;

    //static variable'lar static block kullanilarak da "initialize"edilebilir.
    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static blok kullaniniz.

    public static double price;

    static {
        System.out.println("Hey I am a static block");
        LocalDate d =LocalDate.now();
        if (d.getMonthValue()==3) {
            price = 1000;
        }else {
            price = 1200;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
        LocalDate d =LocalDate.now();
        if (d.getMonthValue()==3) {
            price = 1000;
        }else {
            price = 1200;
        }

    }
    static {
        System.out.println("Hey I am a static block 2");
    }





}
