package day_12_practice;

public class C03 {

   //bU CLASS CALİSTİGİNDA OUTPUT NE OLUR? CALISMA MANTIGINI ANLATINIZ.

   int fiyat =300000;
   int yil = 2023;
   String marka = "Opel";

    public C03(int fiyat, int yil, String marka) {
        this.fiyat= fiyat;
        this.yil= yil;
        this.marka= marka;
    }

    public C03() {

    }


    public static void main(String[] args) {

        C03 obj1 = new C03();

        System.out.println(obj1.fiyat);

        System.out.println(obj1.yil-3);

        System.out.println(obj1.marka.replace("Opel", "Mercedes"));


        C03 obj2 = new C03(500000,2021,"Citroen");

        System.out.println(obj2.fiyat + ", " + obj2.yil + ", " + obj2.marka);

        //instance variable'lar objeye baglidirlar.
        //hangi obje uzerinden, variable'da degisiklik yapildiysa, yapılan bu degisiklik sadece o objeyi baglar
    }

    // kac tane kelime verilirse verilsin
// iclerinden en uzun olanı yazdıran bir method olusturun

// bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız

// bu methodun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classdan calıstırınız

// bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız










}
