package practice;

import java.util.Scanner;

public class Day06ForAgac {

    public static void main(String[] args) {


        /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Yaprak satir sayisi giriniz");
        int yaprakSatir = scan.nextInt();

        System.out.println("Govde satir sayisi giriniz");
        int govdeSatir = scan.nextInt();

        String yaprak = "";

        for (int i = 0; i <yaprakSatir ; i++) {
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <govdeSatir ; i++) {
            System.out.println("|||");
        }


    }
}
