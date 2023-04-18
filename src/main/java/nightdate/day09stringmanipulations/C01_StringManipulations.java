package nightdate.day09stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {
        //****************isEmpty****************\\
        /*
                isEmpty() bos mu dolu mu diye bakar.Bize boolean bir deger
                dondurur sadece hiclikte true dondurur.
                 */

        //EX:Bir String in hiç karakter icermedigini gosteren kodu yaziniz.

        String str ="";
        //1.Yol length()
        boolean bosMu = str.length()==0;//2 is yaptirildilenght8) + ==0 ile karsılastirilma operatoru kullanildi
        System.out.println("bosMu = " + bosMu); //true

        //2.Yol
        boolean bosMu2 = str.isEmpty();// 1 is yaptirildi isEmpty() Makbul olan isEmpty()
        System.out.println("bosMu2 = " + bosMu2);

        //EX: Bir String in bosluk haric hicbir
        // karakter icermedigini kontrol eden kodu yaziniz.

        String str2 = "  ";

        //1.Yol
        boolean result =str2.replace("  ","").length()==0;
        System.out.println("result = " + result);

        //2.Yol
        boolean result2 = str2.replace("  ","").isEmpty();
        System.out.println("result2 = " + result2);

        //EX: Bir String in *haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz.
        String str3 = "*";

        boolean rslt = str3.replace("*","").length()==0;
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);
        System.out.println("rslt2 = " + rslt2);

        //*************** isBlank *******************\\
         /*
         isBlank methodu String bir data da space+hiclik icin true dondurur.
         Bos mu dolu mu oldugunu kontrol eder.Boolean bir deger dondurur.
         isEmpty den farki variable'da sadece space varsa bos mu dolu mu diye
         soruldugunda isBlank ==bos der
                      isEmpty == bos degil der
          */

        //3.Yol
        //String str2 = "  ";
        boolean result3 = str2.isBlank();
        System.out.println("result3 = " + result3);//bosluk karakter degil

        boolean rslt4 = str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//bosluk bir karakter

        //***************** indexOf() ***************************\\
        /*
        indexOf() verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        Tekli karakter icinde coklu karakter ıcınde kullanilabilir.
        Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin
        index'ini dondurur.
        Olmayan bir danin kacıncı index'te oldugunu sorgulatirsak bize -1 dondurur.


         */
        //Ex: Bir String'de a,i,e karakterlerinin indexleri toplamini ekrana yazdiriniz.
        String r = "Java is easy to Learn";


        int aIdx = r.indexOf('a');
        System.out.println("aIdx = " + aIdx);

        int iIdx = r.indexOf('i');
        System.out.println("iIdx = " + iIdx);

        int eIdx = r.indexOf('e');
        System.out.println("eIdx = " + eIdx);

        System.out.println("Toplamlari = " + (aIdx+iIdx+eIdx));

        //EX:Bir String'de "Java" kelimesinin ilk olarak kacıncı index'te
        //kullanildigini gosteren kodu yaziniz.
        String u = "Ah Java vah Java sen ne guzel seysin Java";

         int idxJava =u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);

        int idxPyton = u.indexOf("Phyton");
        System.out.println("idxPyton = " + idxPyton);

        //***************lastIndexOf()***********************\\
        /*
        lastIndexOf() Verilen bir data da karakter ya da karakterlerin
        son gorunumunu indexlerini verir.
        Olmayan bir danin kacıncı index'te oldugunu sorgulatirsak bize -1 dondurur.
         */

        //Ex: Bir String'de a,i,e karakterlerinin indexleri toplamini ekrana yazdiriniz.
        String v ="Java is easy to Learn";

        int aLastIdx = v.lastIndexOf('a');
        System.out.println("aLastIdx = " + aLastIdx);

        int iLastIdx = v.lastIndexOf('i');
        System.out.println("iLastIdx = " + iLastIdx);

        int eLastIdx = v.lastIndexOf('e');
        System.out.println("eLastIdx = " + eLastIdx);

        System.out.println("Toplam Index = " + (aLastIdx+iLastIdx+eLastIdx));









    }//main
}//class
