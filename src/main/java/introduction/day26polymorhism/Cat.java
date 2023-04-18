package introduction.day26polymorhism;

public class Cat extends Animal{

    public void meow(){
        System.out.println("Cats meow");
    }
    @Override //Override Annotation override kurallarini Java tarafindan kontrol edilmesini saglar.
    public  void eat() {
        //Child'daki Override edilmis eat() method'una "Overriding Method denir.
        //Parent'daki Override edilmis eat() method'una "Overriden Method denir.
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}

