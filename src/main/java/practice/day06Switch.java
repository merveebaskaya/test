package practice;

import java.util.Scanner;

public class day06Switch {

    public static void main(String[] args) {
            /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-4 arasi bir sayi giriniz" +
                "işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın");

        int sayi = scan.nextInt();
        int bakiye= 1000;

        switch (sayi){
            case 1:
                System.out.println("Bakiyeniz "+bakiye+ " Tl");
                break;
            case 2:
                System.out.println("Cekmek istediginiz parayi giriniz");
                int cekilenpara = scan.nextInt();
                if (cekilenpara<=bakiye){
                    bakiye = bakiye- cekilenpara;
                    System.out.println("Bakiyeniz "+bakiye+" Tl kalmistir" );
                }else {
                    System.out.println("Yetersiz Bakiye");
                }
                break;
            case 3:
                System.out.println("Yatirmak istediginiz parayi giriniz");
                int yatirilanpara = scan.nextInt();
                if (yatirilanpara<=2000){
                    bakiye = bakiye + yatirilanpara;
                    System.out.println("Para yatirdiktan sonraki bakiyeniz "+bakiye+ " TL");
                }else {
                    System.out.println("Gunluk para yatirma bakiyeniz 2000 TL");
                }
                break;
            case 4:
                System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
                break;
            default:
                System.out.println("Gecerli bir sayi giriniz");
        }


    }
}
