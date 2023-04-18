package javaders.day09_stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

       //Ex:Bir String'in hiç karakter icerip icermedigini kontrol eden kodu yaziniz.

       String str = ""; //hiçlik


        //1.Yol
        boolean result1 = str.length()==0; //Javaya 2 islem yaptirdim.1.si lenght metodu kullandım 2. == kullandim
        System.out.println("String bos mu = " + result1); //true

        //2.Yol
        //**********************isEmpty ()********************\\
        /*
        isEmpty methodu String datanin icerisinde hiçbir sey yoksa True dondurur.
        Java da space de bir karakter oldugu icin space varse False dondurur.
         */
        boolean result2 = str.isEmpty();//Javaya 1 islem yaptirdik isEmpty() kullandik.
        System.out.println("String bos mu = " + result2); //true


        //Bir String'in space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz.
        String t = " ";
        //1.Yol
        boolean result3 = t.replace(" ","").length()==0;//Javaya 3 islem yaptirdik
        System.out.println("result3 t = " + result3);//true
        
        //2.Yol
        boolean result4=t.replace(" ","").isEmpty();//Javaya 2 islem yaptirdik.
        System.out.println("result4 = " + result4);//true

        //3.Yol
        //**********************isBlank()******************\\
        /*
        isBlank()==>space+hiclik ise True dondurur.
        String bir datanin bos mu dolu mu olduguna bakar
        isEmpty den farki space varsa yine True dondurur.
         */

        boolean result5= t.isBlank();//Javaya 1 islem yaptirdik.
        System.out.println("result5 = " + result5);//true



        //***********************indexOf()*************\\
        /*
        indexOff() verilen karakterin ilk gorunumunun indexini verir.
                   int deger dondurur.Coklu data icin kullanildiginda ilk gordugu
                   datanin ilk karakterinin indexini verir.Olmayan bir karakterin
                   indexi sorulursa bize -1 dondurur.
         */
        //Ex:Bir String'de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz.

        String s = "Java is easy to learn";//1(a) + 5(i) +8(e) = 14
        int  aIdx=s.indexOf('a');
     System.out.println("aIdx = " + aIdx);//aIdx = 1

     int iIdx = s.indexOf('i');
     System.out.println("iIdx = " + iIdx);//iIdx = 5

     int eIdx = s.indexOf('e');
     System.out.println("eIdx = " + eIdx);//eIdx = 8
     System.out.println("indexler Toplami : " + (aIdx + iIdx + eIdx)); //indexler Toplami : 14

     int  pIdx=s.indexOf('p');//olmayan karakter sorgulanirsa -1 dondurur.
     System.out.println("pIdx = " + pIdx);//pIdx = -1

     String s2 = "Java is easy to learn to easy to";
     int idx = s2.indexOf("to");
     System.out.println("idx = " + idx);//idx = 13 ilk karakterin(t) indexini veriyor.

     //Bir String de "Java" kelimesinin il olarak kacıncı index te oldugunu gosteren kodu yaziniz.
     String cumle = "Ah Java vah Java ne guzel seysin Java";

     int indexJava = cumle.indexOf("Java");
     System.out.println("indexJava = " + indexJava); //indexJava = 3
     
     int indexQYX=cumle.indexOf("QYX"); //-1
     System.out.println("indexQYX = " + indexQYX); //indexQYX = -1

     //*********************lastIndexOf()*********************\\
     /*
     lastIndexOf() Verilen String bir datada istenilen
     degerin son gorunumunun indexini verir.Olmayan bir karakter
     sorgulanirsa -1 dondurur.
      */

     //Ex : Bir String'de a,i,e karakterlerinin son gorunumunun
     //     indexleri toplamini ekrana yazdiriniz
     String c= "Java is easy to learn";
     int aLast= c.lastIndexOf('a');
     System.out.println("aLast = " + aLast); //aLast = 18

     int iLast= c.lastIndexOf('i');
     System.out.println("iLast = " + iLast);//iLast = 5

     int eLast= c.lastIndexOf('e');
     System.out.println("eLast = " + eLast);//eLast = 17

     System.out.println("Index Toplami = " + (aLast+iLast+eLast));//Index Toplami = 40




        



    }//main
}//class
