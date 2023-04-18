package introduction.day01variables;


public class Variables01 {

    public static void main(String[] args){
       //java bu satiri okumaz.Kendimize veya baskasina aciklamadir.
       /*
       java bu satirlari da okumaz.
        */

        //Variable olusturma
        //data type + variable name + atama operatoru + data + noktali virgul
             int         age               =             13           ;

             //java cumlasi ==  Statement
        //data type +Varible name == variable decleration
        //assignment operator (atama operatoru) + Variable degeri ==> Assignment
        //Eger variable declaration yapar, assigment yapmazsanız java kendi degerlerini (default== varsayılan) koyar.
        //default degerler sayılar icin sifirdir.
        //dilbilgisindeki nokta ne ise java daki noktali virgul aynı seydir ve statementin bittigini gosterir.
        //java da esittir demek "==" . Yani matematikte "=" java da "=="

        /*
             Javada temelde iki tip data vardir.
             1)Primitive data type:
               char, boolean, byte, short, int, long, float, double
             2)Non-primitive data type:
               String (bir sürü var)
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'lere verilen degerler daima cift tirnak icinde olmalidir.
        String studentName = "Ali Can" ;

        //String bir variable olusturup ona herhangi bir atama yapmazsak java o variable'a
        //default olarak "null" koyar.
        //null demek 0 demek degil, o da coding te bir degerdir
        //null demek ici bos obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir.
        //{}

        //char data type:
        //Tek karakterler icin kullanilir.Ornegin ==>A,x,?,5
        //Ornek 2: char data type'inda bir ismin ilk harfi olarak variable olusturunuz ve bir deger atayiniz.
        //Note: char data type'inda degerler tek tirnak icine konulmalidir.
        char isminIlkHarfi = 'A' ;

        //boolean data type:
        //boolean'lar sadece iki farklı deger alabilir;true(dogru) ya da false(yanlis)
        //Ornek 3: booleandata type'inda emekli misin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false ;

        //byte data type:
        //tam sayilar icindir hafıza da 1 byte yer kaplar.
        //byte:-128 den +127 ye kadar tamsayi degerleri icin kullanilir.
        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23 ;


        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar.
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir.
        //Ornek 5 : site nufusu icin bir variable olusturun ve deger atayiniz.
        short siteNufusu = 1200 ;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar.
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6: ulke nufusu icin bir variable olusturun ve deger atamasi yapin.
        int countryPopulation = 186478463;

        //long data type:
        //tamsayilar icindir hafizada 8 byte yer kaplar.
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 7:insan vucundaki hucre sayisi icin variable olusturup deger ataması yapiniz.
        //Note: bir deger long ise sonuna "L"(tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 878787878484818181L;

        //Eger long a atadıgınız deger int'lerin araliginda ise sonuna "l" koymaya gerek yok.
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.

        long weightOfSun = 1354654L;

        //float data type:
        //float data tipi virgullu sayilar (ondalikli sayilar ==> Decimal number) icin kullanılır.
        //float hafiza da 4 byte yer kapla.
        //Note:java ondalikli sayilari yani "Decimal Numbers'i otomatik olarak double kabul eder
        //eger float data type'i olmasinda ısrar ederseniz sonuna F ya da "f" koymalisiniz.


        //ornegin fiyatlandırmalar icin tercih edilebilir(12.99)
        //Ornek 8: Gomlek ve ayakkabı fiyatlari icin 2 tane variable olusturup toplam fiyatı ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;
        System.out.println(shirtPrice + shoesPrice);
        //System.out.println(); yazdırmanin kisa yolu sout yaz ve enter a bas.

        int a =12;
        int b =13;
        System.out.print(a);
        System.out.print(b);
        //System.out.println(); ekrana yazdirir ve pointeri bir sonraki satira yazdirir.
        //System.out.print(); ekrana yazdirir ve pointeri ayni satirda tutar.


        //double data type:
        //double data tipi virgullu sayilar (ondalikli sayilar ==> Decimal number) icin kullanılır
        //double memoryde daha fazla yer kaplar, virgulden sonraki rakam daha fazla alir.
        //Ornek 9: Hucre agirligi ve amipin agirligi icin iki tane variable olusturunuz ve agırlıkları farkını consola yazdirin

        double weightCell = 0.00000000000000112;
        double weightAmip = 0.00000000000000023;

        System.out.println(weightCell-weightAmip);










    }
}
