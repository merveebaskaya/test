package javaders.day05practice;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt();
        System.out.println("sayi = " + sayi);//-2 milyar ile +2 milyar arasindaki herhangi birini bize dondurur.

        //int sayi = rnd.nextInt(n); 0,1,2,3,4,5.... (n-1)
        int sayi1 = rnd.nextInt(5);//0-1-2-3-4 [0 dahil 5) haric.
        System.out.println("sayi1 = " + sayi1);

        //int sayi = rnd.nextInt(n)+m; 0+m, 1+m, 3+m, 4+m....(n-1+m) m==>kaydirma degeri
        int sayi2 = rnd.nextInt(5)+2;
        System.out.println("sayi2 = " + sayi2); //2,3,4,5,6

        //int sayi = k*rnd.nextInt(5)+2; k aralarindaki mesafeyi gosterir.
        int sayi3 = 3*rnd.nextInt(5)+2; //3*==> sayilar arasindaki mesafeyi gosterir. 3 olmali
        System.out.println("sayi3 = " + sayi3);//2,5,8,11,14

        int max = 10;
        int min = 5;
        //5,6,7,8,9,10
        int sayi4 = rnd.nextInt(max); //0,1,2,3,4,5,6,7,8,9 [0,max)
        System.out.println("sayi4 = " + sayi4);
        int sayi5 = rnd.nextInt(max); //0,1,2,3,4,5,6,7,8,9,10 [0,max]
        System.out.println("sayi5 = " + sayi5 );
        int sayi6 = rnd.nextInt(max+1)+min; //5,6,7,8,9,10,11,12,13,14,15
        System.out.println("sayi6 = " + sayi6);
        int sayi7 = rnd.nextInt(max+1-min)+min; //5,6,7,8,9,10  ==>(-min) sola kaydiracagiz.
        System.out.println("sayi7 = " + sayi7);

    }
}
