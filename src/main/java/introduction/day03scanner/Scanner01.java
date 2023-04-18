package introduction.day03scanner;

//javanin util kutuphanesinden scanner class import(ithal etmek,içeri almak) edildi demektir.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1.Adim :scanner classtan bir obje olustur
        Scanner input = new Scanner(System.in);

        //obje ismini input yaptıik cünkü bu obje kullanicidan alınan datayi benim kodlarimin icine koyacak.

        //2.adim: kullaniciya ne istediginize dair öesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz...");

        //3. adim:uygun metdou kullanarak kullaniciya verdigi datayi memorye yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);


    }
}
