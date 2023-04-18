package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    //kullanicidan aldiginiz 5 basamakli bir sayinin ilk 2 ve son 2
    //basamagindaki sayilarn toplamini yazdiran kodu olusturunuz.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();//38671

        //son rakami al.
        int lastDigit =number%10;//1
        //sayiyi küçült
        number=number/10;//3867

        //sondan ikinci rakami al.
        int lastSecondDigit = number%10; //7
        number=number/10; //386

        //sondan 3. rakami al.
        int lastThirdDigit = number%10; //6
        number=number/10; //38

        //sondan 4. rakami al.
        int lastFourthDigit=number%10; //8
        number=number/10;

        //sondan 5.rakami al.
        int lastFifthDigit=number%10; //3
        System.out.println(lastFifthDigit+lastFourthDigit+lastSecondDigit+lastDigit);





    }//main
}//class
