package qamentor;

import java.util.Scanner;

public class Q2_Cevaplama {
     /*Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
    Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
    INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
    herhangi iki kenar farkı diger kenardan büyük olmali
    a+b>c>a-b
    a+c>b>a-c
    b+c>a>b-c
            a=b=c ise es kenar ucgen

     */
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Lutfen 3 tane sayi giriniz.");
         int a =input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();

        if (a+b >c && c > a-b){
            System.out.println("ucgen");
        }else if (a+c>b && b>a-c) {
            System.out.println("bu da ucgen");
         } else if (b+c>a && a>b-c) {
            System.out.println("BU ucgen");
        }else if (a==b && b==c && a==c){
            System.out.println("eskenar ucgen");

        }else {
            System.out.println("ucgen degil");
        }


     }
}
