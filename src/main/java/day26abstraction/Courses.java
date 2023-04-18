package day26abstraction;

     /*
     1)Bazen Parent Class'daki method'un body'si hicbir child class
       tarafindan kullanilmaz.
       Bu durumda parent'daki metho'a body yazmak hic kullanilmadigi icin
       mantikli degildir.
       Bizde o method'a body yazdirmayiz.
      2)Body'si yazilmayan method'a "Abstract Method" denir
       Abstract Ingilizce de "vucutsuz" veya "soyut" anlamindadir.
      3)Method'un body'sini yazmayinca Java hata verir, bizde "abstract"
       keyword'unu kullanarak Java'ya bu method'un body'si olmayacak deriz.
      4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
       normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
      5)Parent'daki method abstract ise butun child class'lar o method'u
        override etmek zorundadir.
        Bu yuzden tum child'lar icin mecburi olmasini istedigimiz fonksiyonlari
        abstract yapmak mantikli bir secimdir.
       6)Body'si olan method'lar(Concrete Method) abstract class'larin icine yazilabilir.
        abstract method'lar concrete class'larin icine yazilamazlar.
       7)"abstract" keyword ile "method body" bir method'da ayni anda kullanilamaz.
       8)"abstract class"larin icinde abstract method'lar olur,"abstract method"lar
        body'si olmadigindan "eksik method"lar gibi dusunulebilir.
        Yani abstract classicinde eksik bir yapi barindirir,siz abstract class'dan
        object uretirseniz abstract class icindeki eksiklik object'e yansir ve object
        eksigi olan bir object olmus olur.
        Java bunu istemez çünkü eksik obje eksik iş yapar.
        Yanlış çalışmasına sebep olur
        Java application'u korumak için abstract classlardan obje üretilmesini
        engellemiştir.
       9)"abstract class"larin constructor'i vardir ama object olusturamazlar.
       10)"final" method'lar "abstract" olamazlar.
       11)"private" methodlar "abstract" olamazlar.
       12)"abstract" class'in abstract chil'i veya concrete child'i olabilir.
      */
       /*
             "final" keyword'u aciklar misiniz?
             "final" keyword i)Variable'larda   ii) method'larda    iii)class'larda kullanilir.

             i)Variable'larda kullanildiginda  a)O variable'a deger atamasi yapilmalidir.
                                               b)ilk atanan deger degistirilemez.
             ii)method'larda kullanildiginda   a)o method'un body'si degistirilemez.
                                               b)O method override edilemez.
             ii)class'larda kullanildiginda a)O class'in child class'i olamaz ama final class'in kendisi child olabilir.

        */

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }






}
