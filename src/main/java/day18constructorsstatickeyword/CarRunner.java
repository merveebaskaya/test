package day18constructorsstatickeyword;

       /*
          1) Constructor nasil olusur?
          Access Modifier + Class Ismi + () +{ }
          2)Methos ile Constructor arasindaki farklar nelerdir?
             i)"Method"larda "return type" olur, Constructorlarda olmaz.
             ii)Methodlar yaptiklari ise göre isimlendirilirler,
             constructorlar ise her zaman class ismi ile isimlendirilirler
             iii)methodlar bir aksiyon yapmak icin olusturulur,constructorlar ise object olusturmak icindir.
             iv)method isimleri kücük harfle baslar,constructor isimleri class ismi ile ayni oldugu icin buyuk harfle baslar
          3)Parametreli Constructor'lar olusturarak ayni classtan farkli objeler olusturabiliriz.
       */

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Mercedes", "C300", 2023, 30000);
        Car c3 = new Car("Audi", "R8", 2023, 50000);
        Car c4 = new Car("BMW");

    }

}