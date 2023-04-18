package day_02_practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Ilk Tamsayiyi Giriniz");
        int a = scan.nextInt();

        System.out.println("Ikinci Tamsayiyi Giriniz");
        int b = scan.nextInt();

        System.out.println(a==b ? ("Sayilar Birbirine Esit") : (a>b ? ("Buyuk Sayi:" + a) : ("Buyuk Sayi:" + b)));

    }
}
