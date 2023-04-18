package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        //i)Alanini hesaplayiniz.==> kisa kenar*uzun kenar
        //ii) Cevresini hesaplayiniz.==> 2* kısa kenar + 2 * uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        double alan=shortSide*longSide;
       // System.out.println("alan = " + alan); //tavsiye edilen.


        System.out.println("Alan = "+(shortSide*longSide));
        System.out.println("Cevre = "+(2*shortSide+2*longSide));



    }
}
