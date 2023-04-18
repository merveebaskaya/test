package nightdate.daytime02;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //INTERWIEW QUESTIONS
        //EX:Kullanicidan aldiginiz bir sekil ile asagıdaki sekli olusturan kodu yaziniz.
        /*
             A
            A A
           A A A
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz...");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        //Ex: Kullanicidan 2 sayi alip 4 işlem yapan ve işlemlerin sonuclarini yazdiran
        // basit bir hesap makinasi kodunu yaziniz.
        System.out.println("Lutfen 2 sayi veriniz");

        int sayi1=input.nextInt();
        int sayi2=input.nextInt();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

        //Kullanicidan alacaginiz 5 basamakli bir sayinin
        // ilk 2 ve son 2 rakamlari toplamini bulan kodu yaziniz.
        //input 12345==>1+2+3+4+5=12

        //1.Yol:
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;//12
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);
        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkirkm = num%100;//45
        System.out.println("sonIkirkm = " + sonIkirkm);
        int sonIkiRkmToplam = (sonIkirkm%10)+(sonIkirkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);

        int toplam = ilkIkiToplam+sonIkiRkmToplam;
        System.out.println("toplam = " + toplam);

        //2.Yol:


        int lastDigit = num % 10;
        num = num /10;
        int lastSecondDigit = num % 10;
        num = num /10;
        int lastThirdDigit = num % 10;
        num = num / 10 ;
        int lastFourthDigit = num % 10;
        num = num / 10;
        int lastFifthDigit = num % 10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);









    }//main
}//class
