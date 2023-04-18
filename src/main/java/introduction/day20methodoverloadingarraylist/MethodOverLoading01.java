package introduction.day20methodoverloadingarraylist;

public class MethodOverLoading01  {
    public static void main(String[] args) {
        String s = "Java";
        //1)Method Overloading ne demek?
        //Ayni isimde farkli isler yapabilen methodlar olusturmak demek
        //2)Ne icin var?
        //Daha derli toplu bir yapi olsun diye,her parametreye gore yeni method olusturmamak adina var.
        //ORNEK sunstring methodu a)tek parametre b)iki parametre
        add(3,5);
        /*
        1)Method Overloading yaparken methos ismi degistirilmez.
        2)Method Overloading yaparken parametreler degistilir.
          a)Parametre degistirirken, parametrelerin data type lari degistirilebilir
          b)Parametre degistirirken, parametrelerin data typelari farkli ise yerlerini degistirebiliriz.
        3)Java icin ismi ve parametreleri ayni olan method tamamiyle aynidir.
        Bu yüzden ismi ve parametre==>method signature olarak adlandirilir
        4)Method Overloading olustururken return type i degistirmenin hiçbir etkisi yoktur.
          Method Overloading olustururken access modifier i degistirmenin hiçbir etkisi yoktur.
          Method Overloading olustururken methodu static veya non-satatic yapmanin hiçbir etkisi yoktur.
          Method Overloading olustururken method body i degistirmenin hiçbir etkisi yoktur.
        5)"private" methodlar overload edilebilir cunku method Overloading sadece bir class in icinde olur.
          "private" olmak ise baska classlara gidildiginde problem olusturur.
        6)"static" methodlar overload edilebilirler.

         */

    }
    public static void add (int a, int b){
        System.out.println(a+b);
    }
    public static void add (double a, double b){
        System.out.println(a+b);
    }
    public static void add (double a, int b){
        System.out.println(a+b);
    }
    public static void add (int a, double b){
        System.out.println(a+b);
    }
    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }



}
