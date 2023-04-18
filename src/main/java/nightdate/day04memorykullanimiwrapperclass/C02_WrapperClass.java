package nightdate.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
    /*


    Javada sonucta bir urundur.developerlar sadece data barindiran
    primitive data typalarinin non primitive ler gibi method da
    barindirmasini istemişlerdir.bunu uzerine Java primitive
    data typalrina method ekleyerek;ozel bir class olusturmustur.
    bunada wrapper(sarmalama durum) class denir.


    Primitive               Non-Primitive
     byte      ===>           Byte
     short     ===>           Short
     int       ===>           Integer   *****
     long      ===>           Long
     float     ===>           Float
     double    ===>           Double
     boolean   ===>           Boolean
     char      ===>           Character  *****




     */


    public static void main(String[] args) {

     byte primitiveByte = 12;
     Byte wrapperByte = 12;

     //byte data type inin en buyuk ve en kucuk degerini ekrana yazdirin
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);//127
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);//-128


     //EX:int data type inin max degeri ile byte data type nin min degerinin
     //toplaminin hesaplatan methodu olusturun.

        int intMax = Integer.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;

        System.out.println("byteMin+intMax ="+(intMax+byteMin));//byteMin+intMax =2147483519


        //***Primitive data typelarini Wrapper Classlara Nasil Ceviririz*****
        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat;//buna Autoboxing denir=>Otomatik kutulama Java
        //bunu otomatik olarak yapar kucuk kutuya yerlestirir.

        //**********Wrapper Classlari Primitive Data Typelarina Nasil Ceviririz****

        Character wrapperChar ='a';
        char primitiveChar =wrapperChar; //Unboxing kucuk kutuyu buyuk kutudan çıkarma
        //Java bunuda otomatik yapar.

     //Ex: verilen iki string datanin toplamini veren kodu yaziniz.

     String str1 = "12345";
     String str2 ="678";
        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        //valueOf()===> String bir datayi Integer a donusturur.

        /*
        Javada "+" sembolu iki int icin otomatikteki gib toplama islemi yapar.
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir.
        buna "Concatination"(ucuca ekle) denir.
        Java matematik bilir işlem onceligine gore calisir
        i)uslu sayilar
        ii)parantez ici
        iii)carpma/bolme
        iv)toplama/cıkarma



         */

        String harf = "A";
        int sayi = 7;
        //harf+sayi===>A7
        /*
        8+3+"K"
        11+K===>11K

        "K"+3*5/2;
         */

        String a= "K";
        int b = 3, c=5, d=2;
        System.out.println(a+b*c/d);//K7


    } //main
}//class
