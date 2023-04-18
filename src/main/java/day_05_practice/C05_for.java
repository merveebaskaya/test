package day_05_practice;

import java.util.Scanner;

public class C05_for {

    public static void main(String[] args) {

         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */
        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i <5 ; i++) { //0'dan 5 'e kadar donguye aldik ve kullanicidan 5 adet sayi girmesini istedik
            System.out.println("Bir Sayi Giriniz");
            int sayi = scan.nextInt();

            if (sayi>=5 && sayi<=10){ //5 ile 10 arasinda olan sayilari isleme almadik
                System.out.println("Girdiginiz Sayi 5 ile 10 Arasinda Oldugundan Isleme Alinmayacaktir");
            }else {
                toplam = toplam + sayi; //degilse sayilari topladik
            }
        }
        System.out.println(toplam);








    }
}
