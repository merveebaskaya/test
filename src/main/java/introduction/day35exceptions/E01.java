package introduction.day35exceptions;

public class E01 {

    /*
    1)"Exception" beklenmedik problem demektir. java cozemedigi bir sorunla karsilastiginda "Exception" class'i devreye girer
    2)Exception class'i bize karsilasilan sorunun cinsini , bu sorunun nereden kaynaklandigini ve sebebini verir
  * 3)Java "exception" firlattiginda kodun calismasini durdurur. Java "exception" olusturan kod icin bizden bir karar vermemizi ister
  * Eger hicbir sey yapmaz isek beklendigi gibi kodumuzun calismasini durdurur.
  * -Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodumuzu catch boluku icinde yazmaliyiz.
  **Exception'u halledebilmek icin iki temel yol vardir
  1)Exception a uygun cozumler uretebilirsiniz.Buna Exception Handling denir.
  2)Exception olustugunda bunu ilan eder veri geri cekilirsiniz.Buada "Throw Exception" denir.
  *Exception'a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi Javadan isteriz.
  Eger Java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez.
  try block icerisinde eger bir "exception" olusursa catch block o zaman devreye girer, ve catch block icindeki kodlar calisir.
  * try block icinde islem yapilirken "Exception" olusursa try block icindeki exceptiondan sonraki kodlar calistirilmaz.
  * catch satirindaki parantez icine karsilasilmasi muhtemel olan ekseption class ismini ve bir obje ismi(e) yazariz.
  * if else kullanirsak olusabilecek her problemi specific olarak if parantezinin icine yazmamiz gerekir.Bu da ciddi bir matematik bilgisi gerektirir
  ve yazacagimiz kodu cok uzatir.
  Ama try catch te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar.
 */

    public static void main(String[] args) {
        divide(12,6);
        divide(12,0);

        divide2(3,0);


    }
    //tavsiye edilmez.
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("sayi sifira bolunemez");
        }else {
            System.out.println(a/b);

            System.out.println("divide method ici");
        }

    }
    public static void divide2(int a, int b){
        try {
            //ArithmeticException yazdiginiz code da matematiksel islem kullaniyor iseniz alinabilecek bir exceptiondir.
            System.out.println(a / b);
            System.out.println("try catch block ici");
        }catch (ArithmeticException e){
            System.out.println("Sayi sifira bolunemez");
        }
        System.out.println("try catch ile handle edildi.");
    }





}
