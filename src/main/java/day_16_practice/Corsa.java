package day_16_practice;

public class Corsa extends Opel{

   protected String hiz="Corsa max 200 km hiz yapar.";
   protected String yakit="Corsa benzinli veya elektriklidir.";
   protected String model="Corsa";
   protected void motor(){
       System.out.println("CORSA ARABALAR CEVRECİ MOTOR KULLANIR.");
   }
   protected void yakitTuketimi(){
       System.out.println("CORSA 5.6 LT YAKIT TUKETIR.");
   }
   protected void vitesSayisi(){
       System.out.println("CORSA 5 VITESLIDIR.");
   }

    public static void main(String[] args) {
       /*
       Inheritance(Instance) variable;
       Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
       Yoksa parent'ina gider.
        Ilk buldugu yerden alir.

       inheritance method();
       Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
       Yoksa parent'ina gider.
       Buldugu yerden hemen almaz.Override edilmis mi diye kontrol eder.
       (Constructor class'ina kadar ayni isimde method var mi diye kontrol eder.)
       Override edileni alir.

        */

       Corsa arb1 = new Corsa();

        System.out.println(arb1.hareket); //Teker ile hareket eder.
        System.out.println(arb1.hiz); //Corsa max 200 km hiz yapar.
        System.out.println(arb1.yakit); //Corsa benzinli veya elektriklidir.
        System.out.println(arb1.marka); //Opel
        System.out.println(arb1.sirketMerkezi); //Almanya
        System.out.println(arb1.model); //Corsa

        arb1.motor(); //CORSA ARABALAR CEVRECİ MOTOR KULLANIR.


        Opel arb2 = new Corsa();

        System.out.println(arb2.hareket); //Teker ile hareket eder.
        System.out.println(arb2.hiz); //Opel arabalar max 220 km hiz yapar.
        System.out.println(arb2.yakit); //Arabalar farkli yakitlar kullanabilir.
        System.out.println(arb2.marka); //Opel
        System.out.println(arb2.sirketMerkezi); //Almanya
        //System.out.println(arb2.model); //CTE  Parentlarında yok geri donmuyor.

        arb2.motor(); //CORSA ARABALAR CEVRECİ MOTOR KULLANIR.
        arb2.garanti(); //OPEL ARABALAR 2 YIL GARANTILIDIR.
        arb2.yakitTuketimi(); //CORSA 5.6 LT YAKIT TUKETIR.
        //arb2.vitesSayisi(); //CTE corsa classina gidemeyiz.overrideina bakariz. parentlarda bulamadık.


        Araba arb3 = new Corsa();

        System.out.println(arb3.hareket); //Teker ile hareket eder.
        System.out.println(arb3.hiz); //Arabalar motor gucune gore hiz yapar.
        System.out.println(arb3.yakit); //Arabalar farkli yakitlar kullanabilir.
        System.out.println(arb3.marka); //Arabalar uretildikleri markaya sahiptir.
        //System.out.println(arb3.sirketMerkezi); //CTE parenti yok,baska yere bakmaz o yuzden
        //System.out.println(arb3.model); CTE

        arb3.yakitTuketimi(); //CORSA 5.6 LT YAKIT TUKETIR.
        arb3.motor(); //CORSA ARABALAR CEVRECİ MOTOR KULLANIR.
        //arb3.garanti(); CTE compile time error
        //arb3.vitesSayisi();


    }



}
