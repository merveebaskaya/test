package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    /*

      1) O method ne iş yapar?
      2)O method nasıl kullanılır?
      3)O method size neyi verir?
     */

    public static <list> void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun"); //removeall icin ekledik sonradan
        cities.add("Yozgat");  //sonradan remove all icin ekledik
        System.out.println(cities);

        //ArrayList'te bir elemanin "ilk gorunumu" nasil silinir?
        System.out.println(cities.remove("Miami"));//Miami
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'te bir eleman index'i kullanilarak nasil silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun]

        //ArrayList olustururken en basa List de yazabilirsiniz.Collection konusunda gorecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanini ages listten siliniz.
        ages.remove((Integer)12);//wrapper Integer yaptık
        System.out.println(ages);//[23, 7, 4]
        // primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
        // Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.


        //Bir ArryListteki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);//Miami

        //Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?
        //Kisa yoldan bir list olusturmak icin asagidaki List.of methodu kullanilabilir.
        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d,k]

        List<Character> letters = List.of('a','c','k','d','k');
        System.out.println(letters);//[a, c, k, d,k]

        //Iki Arraylist'in birbirine esit olup olmadigini nasil anlariz?
        //equals methodu ayni elemanlar ayni index'te oldugu sürece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println(r1);//false

        //indexOf('k') yazarsaniz 'k' nin ilk gorunumunun indexini verir.
        int r2 = initials.indexOf('k');
        System.out.println(r2);//1

        //lastIndexOfindexOf('k') yazarsaniz 'k' nin son gorunumunun indexini verir.
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Example 1: bir listteki tekrarsiz elemanlari consol a yazdiriniz.
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w : prices){

            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w + " "); //3.75 4.0
            }
        }
        System.out.println();

        //Example 2 : Bir Lİst'te tekrarli eleman olup olmadigini gosteren kodu yaziniz.
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter =0;

        for (Double w : heights){

            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("All elements are unique in the list");
        }else {
            System.out.println("At least one element is not unique in the list");
        }










    }
}
