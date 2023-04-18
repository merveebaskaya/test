package introduction.day16arrayforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanin arrayde olup olmadigini yaziniz.
        //1.YOL
        String names[] = {"K","C","R","A","S"};
        String el = "R";

        int counter = 0;

        for (String w : names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has ==>" + el);
        }else {
            System.out.println("Arrays does not have ==>" + el);
        }

        //2.YOL
        Arrays.sort(names);

        int result = Arrays.binarySearch(names, el);
        System.out.println(result);

        if (result<0){
            System.out.println("Arrays does not have ==>" + el);
        }else {
            System.out.println("Array has ==>" + el);
        }

        //1) binarysearch()methodunu sort()methodu olmadan kullanamayiz,
        // cunku binarysearch()mantigi sirali elemanlar icin gecerlidir.
        //2)binarysearch()methodu var olan elemanlar icin sizeo elemanin indexini verir
        //3)binarysearch()methodundan aldigimiz index 0 veya 0 dan buyuk ise bu aradagimiz eleman arrayde var demektir
        //4)binarysearch()methodu olmayan elemanlar icin negatif deger verir
        // "-" isaretinin anlami o arrayde yok demektir.
        //"-" isaretinin yanindaki sayi ise eger o eleman arrayda olsaydi kacinci eleman olurdu demektir

    }
}
