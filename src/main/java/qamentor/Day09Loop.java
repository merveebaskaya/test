package qamentor;

import java.util.Scanner;

public class Day09Loop {
    public static void main(String[] args) {

         /*Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
        Gecerli Username="admin" ve Password="pwd123" dur.

         */
        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if (counter==4){
                System.out.println("Hesabiniz Bloke Edilmistir");
                break;
            }
            System.out.println("Username'inizi Giriniz");
            String username = input.next();

            System.out.println("Password'unuzu Giriniz");
            String password = input.next();

            if (username.equals("admin")&& password.equals("pwd123")){
                System.out.println("Hesabiniza Hosgeldiniz");
                break;
            }
            counter++;
        }while (true);


    }
}
