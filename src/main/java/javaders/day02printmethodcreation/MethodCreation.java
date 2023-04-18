package javaders.day02printmethodcreation;

public class MethodCreation {
    public static void main(String[] args) {

    //static===> protokol tribunu vip class

    //karenin alanini veren kadu yaziniz.
        kareninAlani(7);


        //dikdortgenin alanini veren kadu yaziniz.
        System.out.println("dikdortgenin Alani = " + (dikdortgeninAlani(10, 20)+2));



    }//main

    private static int dikdortgeninAlani(int a, int b) {

        return a*b;//carpmanin sonucunu kullaniciya verdim

    }

    private static void kareninAlani(int a) {

        System.out.println("Karenin Alani : "+(a*a)); //karenin alani:49
    }

}//class
