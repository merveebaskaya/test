package javaders.day07stringmanipulations;

public class C01_StringManipulations {


    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //******************endswith*******************\\
        /*
           endswith() metnin belirli bir datayla bitip bitmedigini verir.
           Bize boolean bir sonuc dondurur.
           Tek karakterde coklu karakterde kullanilabilir.
         */
        //ex: s Stringinin "money" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd=s.endsWith("money");
        System.out.println("isEnd = " + isEnd); //true
        //********************replace()***********************\\
        /*
        replace() Metnin icerisindeki belirli bir datanin yerine verilen diger datayi
        yerlestirir
        String bi data dondurur.
        Tekli karakterler ile de coklu String karakterler ile de calisir
        Ancak her iki tarafta da "" ya da her iki tarafta da '' kullanilmalidir
         */


        //ex: s String indeki "money" kelimesini "dolar kelimesi ile yer degistiriniz

        String s1 =s.replace("money","dolar");

       System.out.println("s1="+s1); //s1=Learn Java earn dolar


        //Ex: s String indeki "earn" kelimesini "win" kelimesine ceviriniz.
        System.out.println( s.replace("earn", "win")); // Lwin Java win money

        //s Stringindeki "a" harflerini "*" ile degistiriniz.

       String s2 = s.replace("a","*");//s2 = Le*rn J*v* e*rn money
       String s3 = s.replace('a','*'); //s3 = Le*rn J*v* e*rn money
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        //Ex: s Steringindeki "n" harflerini "***" degistiriniz
        String s4 = s.replace("n","***");
        System.out.println("s4 = " + s4); //Lear*** Java ear*** mo***ey

       //ex: s Stringindeki tüm "e" harflerini siliniz.
       String s5 = s.replace("e","");
        System.out.println("s5 = " + s5); //s5 = Larn Java arn mony
        /*
        char data typeinin icerisine mutlaka bir karakter yerlestirilmlidir.
        Space bir karakterdir char icine yerlestirilebilir
        ancak hiclik java da char icin kullanilamaz.Bu nedenle silme islemi
        yaparken mutlaka String kullanmaliyiz.
         */

        //********************replaceAll()***********************\\
        /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir.
                     Bir grup datayi ifade edebilmek icin Regular Expression
                     (Regex) kullanilir.

         */

        String t ="Yucel 25 ya$indadir sandik ama 30'mus!.";

        //Ex: t Stringindeki tum rakamlari "*" ceviriniz.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);//t1 = Yucel ** ya$indadir sandik ama **'mus!.

        /*
        En  Cok Kullanilan Regexler
        1)Tum Rakamlar==>[0-9]
        2Tum Kucuk Harfler==>[a-z]
        3)Tum Buyuk Harfler==>[A-Z]
        4)Tum Harfler ==>[a-zA-Z]
        5)Tum Harfler  ve Rakamlar==>[a-zA-Z0-9]
        6)Tum Noktalama Isaretleri==>\\p{Puncht}
        7)Tum Sesli Hafler==>[aeiouAEIOU]

        ^ ==> den farkli, haricinde
        1)Tum Rakamlar Haric==>[^0-9]
        2Tum Kucuk Harfler Haric==>[^a-z]
        3)Tum Buyuk Harfler Haric==>[^A-Z]
        4)Tum Harfler Haric ==>[^a-zA-Z]
        5)Tum Harfler  ve Rakamlar Haric==>[^a-zA-Z0-9]
        6)Tum Noktalama Isaretleri Haric==>\\p{Puncht} ==> [^\p{P}] veya [^\p{Puncht}]
        7)Tum Sesli Hafler Haric==>[^aeiouAEIOU]



         */

        //Ex: t String'indeki tum rakamlari ve tum harfleri unleme ceviriniz.

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2);//t2 = !!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!.

        //Ex: t Stringindeki tum spaceler disindaki karakterleri + ya donusturunuz.

        String t3 = t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3);
        //t3 = +++++ ++ ++++++++++ ++++++ +++ ++++++++

        //Ex: t String'indeki tum kucuk harfler disindaki karakterleri ?'ne donusturunuz

        String t4 = t.replaceAll("[^a-z]","?");
        System.out.println("t4 = " + t4);//t4 = ?ucel????ya?indadir?sandik?ama????mus??

        //Ex: T String'deki Tum sesli harfler disindaki karakterleri & operatoruna
        //donusturunuz

        String t5= t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);//t5 = &u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&u&&&








    }//main
}//class
