package qamentor;

import java.util.Scanner;

public class day06LoopKendim {

    public static void main(String[] args) {

        //Kullanici bir sayi girsin,sayi 100den kucuk ise kullanici "Kazandiniz" mesaji alsin.
        //diger durumlarda "Kaybettiniz" mesaji alsın.
         Scanner scan = new Scanner(System.in);

         do {
             System.out.println("lutfen bir sayi giriniz");
             int a = scan.nextInt();
           if (a<100){
               System.out.println("Won");
           }else {
               System.out.println("Lost");
               break;
           }
         }while (true);

        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.

        do {
            System.out.println("bir cumle giriniz");
            String b = scan.next();
            if (b.endsWith(".")&& ( b.charAt(0)>='A'&& b.charAt(0)<='Z')){
                System.out.println("that's true");
            }else {
                System.out.println("not true");
                break;
            }
        }while (true);

        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Hesabiniz bloke olmustur" mesaji alsın.
        //3 kereye kadar yanlis girerse "Yanlis girdiniz tekrar deneyiniz" mesaji alsın.
        //Dogru girerse "Hesabiniza hosgeldiniz"mesaji alsın.



        int counter = 0;
        String kullaniciAdi = "MerveBaskaya";
        String kullaniciSifresi = "Abc*HRN";

        do {
            if (counter==3){
                System.out.println("Sistem bloke olmuştur.");
                break;
            }
            System.out.println("lutfen adinizi giriniz");
            String x = scan.next();

            System.out.println("Lutfen şifrenizi giriniz");
            String y = scan.next();
            counter++;

            if (x.equals(kullaniciAdi) && y.equals(kullaniciSifresi)){
                System.out.println("hosgeldniz");
                break;
            }else {
                System.out.println("Gecersiz sifre");
                System.out.println(3-counter +"hakkiniz kaldi");
            }

        }while (true);


    }
}
