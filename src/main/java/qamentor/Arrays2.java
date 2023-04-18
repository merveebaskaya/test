package qamentor;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gerek kodu yaziniz.
        /*
        1)Kullanicidan data almak icin Scanner object olusturur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyim.
        3)Arrray olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
        4)Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ne kadar eleman istiyorsaniz sayi giriniz");
        int s = input.nextInt();
        System.out.println("Eger sayi girmek istemiyorsaniz'0' ya basiniz.");



        int sayi[]= new int[s];


        for (int i=0; i<sayi.length; i++){

            System.out.println("Girdiginiz " +(i+1)+ ".sayi");
            int s1 = input.nextInt();
            sayi[i]=s1;
            System.out.println(i);
            if (s1 == 0){
                break;
            }else {
                sayi[i]=s1;
            }
        }
        System.out.println(Arrays.toString(sayi));



    }
}
