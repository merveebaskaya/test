package nightdate.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {
     /*
     Javada islem yaptiran
     == Esittir
     != Esit Degildir
     < Kucuktur
     > Buyuktur
     = Atama Operatoru

     1<4<5 ===>matematik uclu karsılastırma yapar Ancak Java uclu kıyas yapamaz
     1<4 && 4<5;===>Java bu sekilde ikili kiyas yapip Mantik Operatorlerini birlestirirse yapar

     && == ve hem  operatoru mukemmeliyetci yapıdadir.True dondurmesi icin her iki sarti saglamasi gerekir.
     & ile && arasindaki fark
     (3<5 && 6<9 && 11<2 && 4<8 && 2<3)
     cift && operatoru kodun tamamina bakmadan ilk gordugu False degerinde false dondurur.
     Bu nedenle tek & operatorune gore daha hızli calisir.
     Tek & operatoru tum kodu tarar tek bir false var ise false dondurur ama bunun icin tum
     kodun bitmesini bekler.Bu nedenle daha && operatorune gore daha yavas calisir


     (3<5 & 6<9 & 11<2 & 4<8 & 2<3)

     Cay ve Limon
     +   &&  +    ===> True;
     +   &&  -    ===> False;
     -   &&  +    ===> False;
     -   &&  -    ===> False;


    || ==> veya operatoru Polyanaci yapidadir. en ufak bir pozitif durumda True dondurur.
     Cay ve Limon
     +   ||  +    ===> True;
     +   ||  -    ===> True;
     -   ||  +    ===> True;
     -   ||  -    ===> False;



      */

        System.out.println(5+2 ==8);//False

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println("sonuc1 = " + sonuc1); //True

       boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 !=7 ;
        System.out.println("sonuc2 = " + sonuc2);//false

        int sayi1 =15;
        System.out.println(10< sayi1 || sayi1<20);//true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true

        short a = 1000;
        System.out.println(a<15000 || a>28000 || a< -23);//true

        System.out.println(a<=1000 && a == 1000 && a<12);//false

    }//main
}//class
