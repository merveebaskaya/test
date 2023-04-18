package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*

        Numeric Data typelarinin birbirine donusturulmasine Type Casting denir.
        Numeric Data Type'lari byte<short<int<long<float<double

        Kucuk Data Type'larinin buyuk Data Type'larina donusturulmesine
        Auto Widenin(otomatik genisletme)==kucuk kutunun buyuk kutu icerisine
        yerlestirilmesi.

        Buyuk kutunun kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
        Data kaybı olabilecegi icin kodu yazanlara birakir.Buna Explicit Narrowing
        (Aciktan daraltma)denir.


         */
     byte age=13;
     int ageInt=age;//Auto Widenin Otomatik Genisletme

     //long data type ini short a cevirelim.
     long population =1234;
     short populationShort= (short) population; //Explicit Narrowing(Aciktan Daraltma

     //int data typini float data type ina ceviriniz
     int boy = 170;
     float boyFloat= boy;

     //short data type ini byte data type ine cevirelim.
     short numberShort = 115;
     byte numberByte = (byte) numberShort;




    }//main

}//class
