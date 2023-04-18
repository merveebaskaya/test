package practices;

public class C03_Ascii {

    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız

        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */

        char ilkKarakter = 'B' + 1 ;

        char ikinciKarakter = 'D' + 1;

        char ucuncuKarakter = 'L' + 1;

        System.out.println("" + ilkKarakter + ikinciKarakter + ucuncuKarakter);





    }
}
