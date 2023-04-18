package day_10_practice;

public class C03_Instance {

    //static yazmadigi icin instance variable

    int sayi; // 0 //deger atamasi yapmadigimiz icin default degeri 0
    String bransIsmi="Java";
    boolean okuldaMi; //false (deger atamasi yapmadigimiz icin default degeri false var)

    public static void main(String[] args) {

          /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

*/

        //instance variable'lara, static method'dan ulasabilmek icin obje olusturmamiz gerekir.

        C03_Instance obj1 = new C03_Instance(); //class ismiyle olusturmaliyiz objeyi.

        System.out.println(obj1.sayi); //0

        System.out.println(obj1.bransIsmi); //Java

        System.out.println(obj1.okuldaMi); //false

        //Instance variable'lar objeye baglidir.
        //Hangi obje uzerinden variable 'da degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.

        obj1.sayi=10;

        System.out.println(obj1.sayi); //10

        C03_Instance obj2 = new C03_Instance();

        System.out.println(obj2.sayi); //0

        obj1.bransIsmi="SQL";

        System.out.println(obj1.bransIsmi); //SQL

        System.out.println(obj2.bransIsmi); //Java

        System.out.println(obj1.okuldaMi); //false

        obj1.okuldaMi =true;

        System.out.println(obj1.okuldaMi); //true

        System.out.println(obj2.okuldaMi); //false

        obj2.sayi=100;

        System.out.println(obj2.sayi); //100

        obj2.bransIsmi="API";

        System.out.println(obj2.bransIsmi); //API


    }

}
