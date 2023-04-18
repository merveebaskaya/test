package qamentor;

import java.util.Scanner;

public class Q1_Cevaplama {

    /* Soru-1: Kullanicidan alacaginiz iki sayiyi
     yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Yapilacak islemlerden birini giriniz +,-,*,/");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
                System.out.println("isleminiz tanimlanamiyor.");


        }
    }






}