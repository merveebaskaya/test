package day24inheritancepolymorphism;

    /*
       1)Inheritance da object olustururken constructor'lar yukaridan(parent) asagiya(child) dogru calisir.
       2)Parent ve Super es anlamlidir,Child ve Sub es anlamlidir.
       3)super() Her constructor'un ilk satirinda gorunmez olarak bulunur.
        Isterseniz gorunur sekilde de yazabilirsiniz.
       4)super() sizi parent classtaki constructor'a tasir.
       5)this() sizi ayni class icindeki constructorlar arasinda gezdirir.
       6)"this" icinde bulundugunuz class'daki variable'lari cagırmaya yarar.
         "super" parent class'daki variable'lari cagirmaya yarar.
       7)Eger data type'lari "IS-A" ve "HAS-A" varsa bu data type'lerini "COVARIANT" denir.
     */
      /*
      1)Polymorphism ==Coklu sekil
        Yani bir method'un farkli sekillerde karsimiza cıkmasi demek.
        Polymorphism = Overloading(+) + Overriding(-)
      2)Overriding parent class'daki method'u child class'in ihtiyaclarina gore ozellestirerek kullanmak demektir.
      3)Overriding'de method'un body'si degistirilir.
      4)Overriding'de method signature'a dokunulmaz.Dokunulursaniz Java kızar.

       */

public class Car {

    public  void move(){
        System.out.println("Cars move...");
    }
    public void getbreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    public String model = "Car";
    public int price = 0;

    public Car(){
        //super();
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }


}
