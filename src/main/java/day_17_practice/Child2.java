package day_17_practice;

public class Child2 extends Parent2{
    /*
    extends yapilan Class'lardaki, tum constructor'larin ilk satirinda
    biz gormesek bile super() constructor call vardir.
    Dolayisiyla once parent class'taki constructor calisir.
     */
    public Child2(int i) {
        super();
        System.out.println("Child class tek parametreli constructor");
    }

    public Child2() {
        super();
        System.out.println("Child class parametresiz constructor");
    }

    public Child2(int a, int b) {
        super(5,10,15);
        System.out.println("Child class iki parametreli constructor");
    }

    // Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız

    public static void main(String[] args) {
        
        Child2 obj1 = new Child2();
        
        Child2 obj2 = new Child2(1);

        Child2 obj3 = new Child2(2,3);
        
    }

}
