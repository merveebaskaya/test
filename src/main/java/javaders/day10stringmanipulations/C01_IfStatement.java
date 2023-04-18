package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //If it rains; Iwill cancel the picnic.
        //Eger yagmur yagarsa, piknigi iptal edecegim.

        //Ex: verilen karakterin buyuk harf ise ekrana"Buyuk Harf"
        //yazdiran kodu yaziniz.

        char ch = 'A';

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }//if body
        //Ex: Verilen sayi cift sayi ise ekrana cift sayi
        // yazdiran kodu yaziniz.

        byte sayi = 0;
        /*
        Karsşlastşrma operatorleri: == Esit Mi?  != Esit Degil Mi?
        >=Buyuk Esit       <= Kucuk Esit
        göndericiden kod almakistersek böyle yapıyoruz.
         Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int say = input.nextInt();
         */


        //kodun dinamik yazilmasi icin variable'in ismi yazilir.
        // Direk deger yazilirsa "hurd coding" yani tek datalik kod olur.

        if (sayi %2 == 0){
            System.out.println("Cift sayi");
        }//if body
        //Verilen bir sayi 300 de kucuk veya 1200den buyuk ise "Harika Sayi"
        //yazdiran kodu yaziniz.

        int number = 200;
        if (number<300 || number>1200){
            System.out.println("Harika Sayi");
        }

        //kullanicidan alinan datanin tek sayi mi cift sayi mi oldugunu
        //yazdiran kodu yaziniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();
        //1.Yol Bagimsiz if Statement
        if(num %2 ==0){
            System.out.println("Cift Sayi");
        }//if body Cift

        if(num %2 !=0){
            System.out.println("Tek Sayi");
        }

        //2. Yol If Else
        if (num %2 == 0){//Eger num icerisindeki datanin 2 ye bolumunden kalan0 a esitse "cift sayi
            System.out.println("Cift Sayi");
        }else {//else=degilse demek geriye kalan tum ihtimaller icin calisir.
            System.out.println("Tek Sayi");
        }
        //ex:verilen bir sayinin negatif mi pozitif mi notr mu oldugunu soyleyen
        //kodu yaziniz.

        int numara = 0;

        if (numara<0){
            System.out.println("3 lu kontrol Negatif Sayi");
        }else if (numara==0){
            System.out.println("3 lu kontrol Notr Sayi");
        }else {
            System.out.println("3 lu kontrol Pozitif Sayi");
        }


    }//main
}//class
