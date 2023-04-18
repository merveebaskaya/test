package day_18_practice;

import java.util.*;

public class C02_Iterator {

      /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(st);

        Iterator itr = st.iterator(); //set'lerde index yapisi yoktur.Bu sebeple Iterator kullanilir.
                                     //List hari hic bir collections uyesinde index yapisi yoktur.

        while (itr.hasNext()){//iterator'un yaninda eleman var mı kontrol ediyorum
                             //varsa true, yoksa false dondurecek
                            //true oldugu muddetcee while dongusu devam edecek.

            Object sayi = itr.next();

            if ((Integer) sayi%2==0){
                itr.remove();
            }

        }
        System.out.println(st);




    }



}
