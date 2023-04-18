package nightdate.day09stringmanipulations;

public class C02_IfStatement {

    public static void main(String[] args) {

     //INTERWIEW QUESTIONS USA QA

     //Bir String'deki tekrarsız karakteri ekrana yazdiriniz.
     //String y ="abbccdc";

     String y = "aac"; //c soru cozumu cok uzamamasi icin y bu sekil alindi.

     char ch = y.charAt(0);
     if (y.indexOf(ch)==y.lastIndexOf(ch)){
         System.out.println(ch);
     }//if body iki curly braces arasi

     char ch1 = y.charAt(1);
     if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
         System.out.println(ch1);
     }

     char ch2 = y.charAt(2);
     if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
         System.out.println(ch2);
     }

     //Ex: Verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiram kodu yaziniz.
     int num = 65;

     if(num>0){
         System.out.println("Sayi Pozitif");
     }

     //sayi -1 ve 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz.
     int rakam = 33;
     //Rakamlar 0 1 2 3 4 5 6 7 8 9

     if(rakam>-1 && rakam<10){
         System.out.println("Verilen Data Rakamdir");
     }
        System.out.println("******* **********");

     //ex:Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
      int sayi = -123;
      sayi=Math.abs(sayi);
      if (sayi>99 && sayi<1000){
          System.out.println("Verilen Data 3 Basamaklidir");

      }




    }
}
