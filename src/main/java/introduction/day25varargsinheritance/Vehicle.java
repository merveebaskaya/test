package introduction.day25varargsinheritance;

public class Vehicle {

    /*
    1)Javada Object Class tum java classlarinin ortak parentidir.
    2)Javada Object Class haric tum Classlarin parenti vardir.
    3)Javada Parent'dan Child'a olan iliskilere HAS A relationship denir
      Javada Child'dan Parent'a olan iliskilere IS A relationship denir.
    4)Javada her class'in bir tane default constructor'a vardir.Bu default constructorclassin icinde gorulmaz cunku
    default constructor Object Class'in icindedir.
    5)Child Class'ta bir obje olusturdugumuzda Constructorlar en ustteki
    parent classtan baslatilarak alta dogru calistirilir.
    6)Child Class'daki construct'dan parent class'tadi constructor'a gidebilmek icin super() kullanilir.
    7)Parent Classda birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler
    yardimi ile secilebilir.
    8)Ayni Class icindeki constructorlari secmek icin this() kullanilir.
    Ayni classta birden fazla constructor varsa istenilen constructor this() parantezinin icine yazilan parametreler
    yardimi ile secilebilir.
    9)super() ifadesinin yazmak istege baglidir.Siz yazmasanizda Java sanki super() varmis gibi davranir.Ama kodunuzu
     daha okunur kılmak icin yazmaniz tavsiye edilir.
     10)super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir.
     11)Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir.bakiniz 10. madde
     12)Inheritance da variable'lari ve method'lari cagırmak icin this veya super kullanilir.
        this==> kendi class'indan
        super==> parent class'indan variable ya da method cagirmayi saglar.


     */

    public Vehicle(){

        System.out.println("Vehicle1");
    }
    public Vehicle(int price){
        System.out.println("Vehicle int parametreli");
    }
}
