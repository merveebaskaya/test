package javaders.day08stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {
      //****************replaceFirst ()*****************\\
      /*
      replace() methoduyla ayni isi yapiyorancak ilk datayi degistiyor
       */
      String str = "Hayirli Olsunda" ;

      //Ex: str String'indeki ilk gorunen a harfini e harfi ile degistiriniz

      String str1 =str.replaceFirst("a","e");
        System.out.println("str1 = " + str1);//Heyirli Olsunda


        //**********************trim()********************\\
        /*
        trim() bir String'deki basında ve sonundaki space karakterlerini siler
        Aradaki spacelere dokunmaz.Saclar icin uclardaki kırıkların aldirilmasi gibi.
        Cumledeki spacelerin silinmesi.


         */

        //Ex: str2 String'inbdeki bas ve sonda varsa space karakterlerini siliniz

        String str2 = "   Ali Can   ";
        System.out.print(str2);
        System.out.println("*******");
        String strTrim = str2.trim();
        System.out.print(strTrim);
        System.out.println("*******");

        //eX: Asagida fiyatlari verilen urunlerin toplam fiyatlarini bulunuz.
        //String tv=599.9 $        String laptop = 299.9 $
        String tv ="599.9$";
        String laptop="299.9$";

        String tv2=tv.replace("$","");
        System.out.println("tv2 = " + tv2); //tv2 = "599.9"
        String laptop2=laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);//laptop2 = "299.9"

        System.out.println(tv2+laptop2); //599.9299.9 uc uca ekle.Burada "+" isareti concatination yapar
        // cunku hala datalar String oldugu icin

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice); //totalPrice = 899.8
        /*
        valueOf() methodu String olan datayi bize sayi haline getirir.
         */

      //Ex:Verilen ismin ilk isminin ilk harfini
      //ve soyisminin ilk harfini ekrana yazdiriniz.

      String tamIsim="  mehmet fatih  ";//==> MF
      char first = tamIsim.trim().toUpperCase().charAt(0);//M

      char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
      System.out.println("second = " + second);//F
      System.out.println("Ilk Harf Son Harf :" + first+second);
      
      String str3="mehmet fatih yildirim";
      char first2 = tamIsim.trim().toUpperCase().charAt(0);
      char second2 = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
      char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);
      System.out.println("first2+second2+third = " + first2+second2+third);//MFY








    }//main
}//class
