package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //kullanicidan adresini aliniz ve ekrana yazdiriniz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen aderisinizi giriniz... ");
        //next() methodu kullanicida tek kelimeli String i almak icin kullanilir.
        //nextline() methodu kullanicidan .ok kelimeli Strin i almak icin kullanilir.

        String address = input.nextLine();

        System.out.println(address);

    }

}
