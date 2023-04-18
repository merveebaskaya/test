package qamentor;

import java.util.Scanner;

public class Day08Loop {

    public static void main(String[] args) {

        //Soru 1 ) While loop kullanarak 3 den 13 e kadar
        // tum tek tamsayilari ekrana yazdiriniz.

        int i = 3;
        while(i<14){
            if(i%2!=0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        //Soru 2 ) While Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90'na tam
        //bolunebilen sayilari yazdirin.

        i= -900;
        while (i<1000){
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        //Soru 3 ) Kullanicidan başlangic ve bitiş degerlerini alin. Başlangic degeri ve bitiş degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int baslangic = scan.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis = scan.nextInt();

        i = baslangic;
        while (i<=bitis){
            if (i%2==0){
                System.out.print(i +" ");
            }
            i++;
        }
        System.out.println();

        //Kullanicidan bir tamsayi isteyiniz ve tamsayinin ilk rakamini
        // ve sonrakamini toplayan kodu yaziniz
        System.out.println("Tamsayi giriniz");
        int tamSayi = scan.nextInt();
        tamSayi = Math.abs(tamSayi);
        int sonRakam = tamSayi%10;
        System.out.println("Sonrakam:"+sonRakam);

        int ilkRakam = tamSayi;


        while (ilkRakam>9){
            ilkRakam/=10;
        }
        System.out.println("Ilkrakam :"+ ilkRakam);
        System.out.println("Toplam:"+(ilkRakam+sonRakam));











    }
}
