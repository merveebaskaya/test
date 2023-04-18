package practices;

import java.util.Scanner;

public class C07_ifElse {



    public static void main(String[] args) {


        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);


        System.out.println("Ilk Sayiyi Giriniz");
        int ilkSayi = scan.nextInt();


        System.out.println("Ikinci Sayiyi Giriniz");
        int ikinciSayi = scan.nextInt();



        if (ilkSayi>ikinciSayi){
            System.out.println("Ilk sayi ikinci sayidan buyuktur");
        }else {
            System.out.println("İlk sayi ikinci sayidan buyuk degildir");
        }


    }
}
