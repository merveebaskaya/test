package nightdate.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {
        String s = "Learn Java earn money";
         //*******************endsWith**********************\\
        /*
        endsWith() Metnin belirli bir datayla bitip bitmedigini verir.
        True ya da False seklinde boolean bir deger dondurur.
        Icerisine tek karakterde  coklu karakterde koyabilirsiniz.
         */

        //ex: String inin "money" ile bitip bitmedigini kontrol edin.

        boolean isEnd  = s.endsWith("money");
        System.out.println("isEnd = " + isEnd); //isEnd = true

        String s2 = "Learn money Java earn";
        boolean iceriyorMu =s2.contains("money");
        System.out.println("iceriyorMu = " + iceriyorMu);

        /*
        contains methodu cumlenin her hangi bir yerinde istenilen
        bir datayı bulursa true dondurur ancak task in bizden istedigi
         "money" kelimesi ile bitip
        bitmedigi oldugu icin endsWith() methodu kullanmaliyiz.
         */


        //**************************replace()*******************\\

        //Ex: s Stringindeki "money" kelimesini "dollar" kelimesi ile yer degistirelim

        String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar

        //Ex: s String'indeki earn kelimesini win kelimesine ceviriniz.
        
        String s3 =s.replace("earn","win");
        System.out.println("s3 = " + s3);//s3 = Lwin Java win money

        //Ex: s String indeki "a" harfini "*" ile degistiriniz.
        String s4 =s.replace('a','*');//makbul olan budur
        String s5 =s.replace("a","*");
        //String s6 =s.replace("a",'*'); ayni data tipi degil olmaz.
        System.out.println("s4 = " + s4);//s4 = Le*rn J*v* e*rn money

        //Ex: s String'indeki "L" harfini "***" ile degistiriniz.

        String s6 =s.replace("L","***");
        System.out.println("s6 = " + s6);//s6 = ***earn Java earn money

        //Ex: s String'indeki tum "e"harflerini siliniz.

        String s7 =s.replace("e","");
        System.out.println("s7 = " + s7);//s7 = Larn Java arn mony
        String s8 = s.replace('e',' ');
        System.out.println("s8 = " + s8);//s8 = L arn Java  arn mon y
        //space ile silme yapılmaz. space in java icin bir anlami vardir
        //ve bir karakterdir
        //task te istenilen saglanmamiş olur.

        //Ex: s String'indeki tum "earn"kelimelerini siliniz.

        String s9=s.replace("earn","");
        System.out.println("s9 = " + s9);//s9 = L Java  money

        String t ="Dolma Kalem";
        //t String'indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz.

        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);//t1 = Dolma Biber

        //************************replaceAll**********************\\










    }//main
}//class
