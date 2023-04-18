package qamentor;

import java.util.Scanner;

public class Day07_2 {
    public static void main(String[] args) {
        // Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        // dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Lutfen yapacaginiz islemi seciniz");
        char islem = input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case  '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            default:
                System.out.println("Gecerli islem girin");
        }

    }
}
