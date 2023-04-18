package introduction.day26polymorhism;

public class Animal {
    /*
    1)Parent Class'taki method'u Child class icinde ozellestirerek kullanmaya Overriding denir.
    2)Overriding'de methodun parantezine ve methodun ismine dokunulmaz.(==>Method Signature)
    3)private method'lar Override edilemezler.
    4)Child Class'taki methodun access modifieri parent tan daha dar olamaz.
    5)Child class'da override edilen method'un return type'i ile Parent'taki method'un return type'i arasinda
    IS-A iliskisi varsa return type degistirilebilir.
    6)method'un return type'i primitive ise Overriding yaparken primitiveler degistirilemez cunku return type
     ya ayni olur ya da parent'tan secilir, ama primitiveler arasinda parent-child iliskisi olmadigindan parent
     secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir.
    7)Child'da override edilen methodun return type'i ile parent'taki methodun return typei arasinda
      IS-A iliskisi yoksa return type degistirilemez.
      Mesela;
      Integer Wrapper classi ile long wrapper classi arasinda IS A iliskisi yoktur o yuzden return type i
      degistiremedik.
     8)Methodun return type i void ise overriding yaparken return type degistirilemez.
     9)static methodlar override edilemezler cunku static methodlar tum childlar icin ortak methodlardir.
     Bir child bir ortak methodu degistirdiginde diger childlar bundan olumsauz etkilenebilir.
     Bu yuzden Java static methodlarin override edilmesine izin vermez.
     10)final methodlar override edilemezler.final methodlarin baodysi degistirilemez ama override ederken
     method bodyi degistiririz bu bir celiskidir. Bu yuzden Java final methodlarin override edilmesine musaade etmezler.
        a)Final keywordunu Variablelar ile kullanabiliriz.
            i)final variable ise mutlaka deger atanmalidir.
            ii)ilk atanan deger degistirilmez.
        b)Final keywordunu methodlar ile kullanabiliriz.
            i)method final ise methodun bodysi degistirilemez.
            ii)methodun bodysi degistirilemeyince override yapmak mumkun olmaz.
        c)Final keywordunu Classlar ile kullanabiliriz

                    => class final ise O classin child i olamaz
     ==>Polymorphism ==>Method Overloading +Method Overriding


     */

    public  void eat(){

        System.out.println("Animals eat");
    }
    public void drink(){

        System.out.println("Animals drink");
    }
    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply (int a, int b){
        return a*b;
    }
    public final double circleArea (double r){
        return 3.14*r*r;
    }
    final double PI = 3.14;


}
