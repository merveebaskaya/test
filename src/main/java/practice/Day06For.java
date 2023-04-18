package practice;

import java.util.Scanner;

public class Day06For {

    public static void main(String[] args) {

         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Sisteme 5 sayi giriniz");
           int sayi = scan.nextInt();
           if (sayi>=5 && sayi<=10){
               System.out.println("5-10 arasindaki sayilar isleme alinmayacaktir");
           }else {
               sum = sum + sayi;
           }
        }
        System.out.println(sum);



    }
}
