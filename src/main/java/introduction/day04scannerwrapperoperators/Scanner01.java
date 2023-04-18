package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2 basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();
        //bir sayinin son rakamini alabilmek icin o sayıyı 10'a bolup kalanını almaliyiz.
        //%==> modulus operation solunda bulunan sayinin saginda bulunan sayiya bolumundan kalani veriyor.
        //dolayisi ile %10 her zaman bize birler basamagında bulunan sayiyi verir.
        //bir tam sayiyi bir tamsayiya bolerseniz java sonucu kesinlikle bir tamsayı yapar.
        //java bu durumda yuvarlama yazmaz ondalıklı kısmı iptal eder.
        //dolayisiyla bir tam sayıyı 10'a bolersek birler basamagını silmis oluruz.

        //son rakami al.
        int lastDigit = number%10;
        //sayi kucult.
        number = number/10;

        //sondan ikinci rakami al.
        int lastSecondDigit = number%10;
        //sayi kucult.
        number = number/10;

        //sondan ücüncü rakami al.
        int lastThirdDigit =number%10;
        //sayi kucult.
        number = number/10;

        //sondan dorduncu rakami al.
        int lastFourthDigit = number%10;
        //sayi kucult.
        number = number/10;

        //sondan besinci rakami al.
        int lastFifthDigit = number%10;
        //sayiyi kucult.
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);




    }

}
