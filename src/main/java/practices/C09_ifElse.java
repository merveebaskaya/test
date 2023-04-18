package practices;

import java.util.Scanner;

public class C09_ifElse {

    public static void main(String[] args) {
        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Numara Giriniz");

        int numara = scan.nextInt();


        if (numara<0){
            System.out.println("Negatif Sayi");
        }else{
            if (numara<10){
                System.out.println("Pozitif Rakam");
            }else {
                System.out.println("Pozitif Sayi");
            }
        }
        


    }
}
