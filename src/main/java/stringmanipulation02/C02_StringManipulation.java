package stringmanipulation02;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
          /*
        Soru 2) Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresini giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresini giriniz");
        } else if (email.contains(" ")) {
            System.out.println("Lutfen bosluksuz deger giriniz");
        }else if (email.endsWith("@mail.com")){
            System.out.println("email adresiniz kaydedildi");

        } else System.out.println("Lutfen yazimi kontrol ediniz.");


    }
}
