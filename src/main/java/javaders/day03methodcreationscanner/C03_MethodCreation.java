package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {
        //dikdortgenin alanini hesaplatan bir method olusturunuz.
        //dikdortgeninAlani(10,20)+2; (void oldugu icin +2 ekleyemiyorum)
        dikdortgenAlani(10, 20);

        //karenin alanini hesaplatan methodu yaziniz.
        System.out.println("kareAlani(6) = " + kareAlani(6)+2);

    }//main

    private static int kareAlani(int a) {

        return a * a;
    }

    private static void dikdortgenAlani(int a, int b) {

        System.out.println(a * b);//200
    }
}//class
