package nightdate.day03methodcreationscanner;

public class C03_MethodCreation {
    /*


    java da nethod nasil olusturulur

    1) java da method main in disinda olusturulur
    2)tekrar tekrar kullanmamiz gerekiyorsa method olustururuz
    Access Modifier + Return Type + methodIsmi + ( ) + { }

    islem yapilacak sayilari methodIsmi() parantezin icine eklenir.

    Scope== Kapsam Alani bir variable in bir degerin,hangi kapsam icinde
    oldugunu gosterir.(a,b)


     */
    public static void main(String[] args) {

        //1)verilen 2 sayiyi toplayan methodu olusturunuz.
        toplamaYap(30, 87);

        //2)verilen iki sayiyi carpan methodu yaziniz.
        multiply(46, 12);

        //3)verilen 3 sayidan ilk ikisini çarpan ve sonucu ücüncü sayi
        //ile toplayan methodu olusturunuz ve kullaniniz.
        System.out.println("firstTwoMultiplyThirdAdd(2,3,5) = " + firstTwoMultiplyThirdAdd(2, 3, 5)*2);

        //4)verilen bir ondalikli sayinin kupunu hesaplayip kullandıran bir
        //bir method olusturunuz. 5.6

          double sayininKupu= getCube(5.6);
            System.out.println("sayininKupu = " + sayininKupu);

       //5)dairenin cevresini hesaplayan methodu olusturunuz ve kullanınız.
        System.out.println("daireninCevresi(2) = " + daireninCevresi(2));

    }

    private static int daireninCevresi(int r) {
        return 2*314*r/100;
    }




    static double getCube(double v) {

        return v*v*v;
    }

    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {

        return a*b+c;

    }

    private static void multiply(int a, int b) {
        System.out.println("carpma methodu :" + a * b);

    }

    static void toplamaYap(int a, int b) {
        //Access modifiers default old icin birsey yazilmadi
        System.out.println("topalama methodu : " +a + b);
    }

}//class
