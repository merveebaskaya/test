package day_14_practice;

public class C02_Overloading {

    public static void main(String[] args) {



        //Ayni Class'da ayni isimde method olusturunuz.

        /*
        //Ayni Class'da ayni isimde method olusturmak icin

        1) parametrelerin data turleri degistirilebilir.
        2)parametrelerin sayisi degistirilebilir.
        3)parametrelerin data turleri farkli oldugunda parametrelerin yeri degistirilebilir.

        */
        toplama(55,66);
        toplama(2.3, 4.5);

        carpma(1,2,3);
        carpma(1,2,3,4);

        cikartma(3.7, 1.3f);
        cikartma(1.3f, 3.7);


    }

    //1) parametrelerin data turleri degistirilebilir.
    private static void toplama(int a, int b){
        System.out.println("iki int deger toplandi: " + (a+b));
    }

    private static void toplama(double a, double b){
        System.out.println("iki double deger toplandi: " +  (a+b));
    }

    //2)parametrelerin sayisi degistirilebilir.
    private static void carpma(int a, int b, int c){
        System.out.println("uc int deger carpildi: " + (a*b*c));
    }
    private static void carpma(int a, int b, int c, int d){
        System.out.println("dort int deger carpildi: " + (a*b*c*d));
    }

    //3)parametrelerin data turleri farkli oldugunda parametrelerin yeri degistirilebilir.
    private static void cikartma(double a, float b){
        System.out.println("ilki double, ikincisi float cikartma islemi yapildi: " + (a-b));
    }
    private static void cikartma(float b, double a){
        System.out.println("ilki float, ikincisi double cikartma islemi yapildi: " + (a-b));
    }





}
