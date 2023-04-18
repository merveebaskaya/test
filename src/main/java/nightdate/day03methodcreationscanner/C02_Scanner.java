package nightdate.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

    //kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini
    //ekrana yazdiran programi yazdiriniz.
        //%==> modulus operatotu sayinin bolumunden kalan sayiyi verir

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklibir sayi giriniz...");
        int sayi = input.nextInt();//8649
        int sonRakam = sayi%10; //9
        int ilkRakam = sayi/1000; //8
        /*
        3 basamakli bir sayinin ilk basamagını almak icin (basamak sayisi-1)
        0 olan yani 100 e bölmeliyiz.

        4 basamakli bir sayinin ilk basamagını almak icin (basamak sayisi-1)
        0 olan yani 1000 e bölmeliyiz.

        5 basamakli bir sayinin ilk basamagını almak icin (basamak sayisi-1)
        0 olan yani 10000 e bölmeliyiz.
         */

        System.out.println("ilkRakam+ sonRakam = "+(ilkRakam+sonRakam));



    }//main
}//class
