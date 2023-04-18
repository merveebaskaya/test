package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

     /*
     -Javada farkli data typelari arasında işlem yapılıyorsa sonuc
     buyuk olan data type in turunde olu.
     -Karsılastırma operatorlerinde sonu hep boolean doner.
     < KUCUKTUR
     > BUYUKTUR
     == ESITTIR
     != ESIT DEGILDIR
     <= KUCUK ESITTIR
     >= BUYUK ESITTIR
     && AND (VE) OPERATORU
     || OR (VEYA) OPERATORU



     */

        System.out.println(4*(5+2)/3);//9 int/int==>int olacagı ıcın
        //9.333333333333334 yerine virgulden sonrasini siler ve tamsayi
        //kismini alır., biz 9 rakamini goruruz.

        System.out.println(6*16/8); //12


        double sonuc =4*(2+5)/3;
        System.out.println("sonuc = "+sonuc);//9.0
        
        double sonuc2 = 4.0*(2+5)/3;//sonuc2 = 9.333333333333334
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println(4*(1+5)/3); //8
        int sayi1 =5;
        int sayi2=2;
        double sayi3=2;
        System.out.println(sayi1/sayi2);//2 normalde 2.5 ancak
        //int/int=int olacagı icin tam sayi alinir virgulden sonrasi
        //atilir.

        System.out.println(sayi1/sayi3); //2.5
        System.out.println(sayi1+sayi3/sayi2);//6.0
        boolean first = 2<4;
        boolean second = 2+6!= 8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first);//t
        System.out.println("second = " + second);//f
        System.out.println("third = " + third);//t

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true


    }//main
}//class
