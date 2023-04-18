package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        String a = "Benim Tek Rakibim Dunku Ben*.";
        //*********toUpperCase()********\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//aUpper = TEK RAKİBİM DUNKU BEN .
        //******toLowerCase()*********\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);//aLower = tek rakibim dunku ben .

        //******charAt(0)***********\\
        System.out.println("ilk karakter : " + a.charAt(0)); //B
        System.out.println("a.charAt(10) = " + a.charAt(10));//a.charAt(10) = R

        //a Stringindeki bastan ikinci ve sondan ikinci karakteri alın ve yan yana yazdiriniz.
        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(20);
        System.out.println("firstChar+lastSecondChar = " + firstChar + " " + lastSecondChar); //firstChar+lastSecondChar =e n

        //************lenght()************\\
        //a Stringinde bulunan karakter sayisini bulunuz.
        System.out.println("a.length() = " + a.length());//29

        //*********subString********\\
        //a String indeki ilk 4 datayi aliniz.
        String sub1 = a.substring(0, 4); //0 dahil 4 harictir. [0,4)==>0. index,1. index
        //2.index,3.index alinir 4. index alinmaz
        System.out.println("sub1 = " + sub1);//Beni

        //a Strinndeki 4. index dahil 7. index haric yazdiriniz
        System.out.println("a.substring(4,7) = " + a.substring(4, 7));//a.substring(4,7) = m T

        //a String indeki Rakib kelimesini aliniz.
        System.out.println("a.substring(10,15) = " + a.substring(10, 15));//a.substring(10,15) = Rakib

        System.out.println("a.substring(10) = " + a.substring(10));//a.substring(10) = Rakibim Dunku Ben*.

        //*******************contains()*******\\
        //a String inde "bim" kelimesi olup olmadigini kontrol ediniz.

        boolean varMİ = a.contains("bim");
        System.out.println("varMİ = " + varMİ);//true

        //*********startsWith()**********\\
        //a String inin "T" harfi le baslayip baslamadigini kontrol ediniz.

        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T"));//false
        System.out.println(a.startsWith("Tek", 6));//true ilk 6 karakteri at;sonrasi "Tek" kelimesiyle baslıyor mu?
        //prefix baslangıc,  offset: at gitsin

        //Universite numaralari yil+bolum kodu+OBolumeGirisSirasi olarak duzenlenen bir okulda
        //ogrenci umram hukuk fakultesinde okuyup okumdigini gosteren kodu yaziniz.

        /*
        sinif 22 hukuk 33 bilgisayar 44 eczacilik 55 maliye 66 kimya muhendisligi 77 olsun

         */
        String str = "20103301";
        System.out.println(str.startsWith("33,4"));//true


    }//main
}//class
