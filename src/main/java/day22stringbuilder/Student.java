package day22stringbuilder;

public class Student {

    //stdName public oldugu icin diger class'lardan ulasilabilir.

    public String stdName = "Ali Can";

    //Access Modifier'i "default" olan ile "public"olan class member'lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package a gectiginizde "public" olanlara ulasilabilir,"default" olanlara ulasilamaz.
    int age =23;

    //Access Modifier'i "private" olan class member'lar sadece olusturduklari class
    //icinden gorulebilirler.
    //Olusturduklari class in disina cıktıgınızda gorunmez, ulasılmaz olurlar.
    private String healthCondition = "Cancer";

    //Access Modifier'i "protected" olan Class Member'lar ayni packagw icinde iken "public" gibi
    //davranirlar.
    //Farkli package'a gectiginizde protected olanlar sadece child classlardan gorulebilir.
    protected int salary = 3000;

    //Note:Class'lar public ve default olabilir.Ama private ve protected olamazlar.


}
