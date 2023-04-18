package javaders.day09_stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {
        /*
        If Statement() yapisi bazen kodalarin calismasi belirli kosullara baglidir.
        Mesela cok calisirsam Java ogrenecegim. Java orenme eylemi cok calisma eylemine baglanmıştır
        1. eylem gerçeklesmeden 2. eylem gerceklesmez.
        if(){}
        () parantez içine sart yazilir eger true dondururse {}body arasindaki kod calisir.
        aksi halde if body disina çikar class'ta sonraki kodlari okumaya devam eder.
         */

      //INTERWIEW QUESTIONS USA QA
      //String str = "abbccdc" tekrarsız karakterleri ekrana yazdiriniz.
        String str ="aac";

        char ch=str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch); } //if body

        char ch1=str.charAt(1);
        if (str.indexOf(ch1)==str.lastIndexOf(ch)){
            System.out.println(ch1);
        }//if body

        char ch2=str.charAt(2);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }//if body

        //c

        //Ex:Sayi pozitif ise ekrana"Pozitif Sayi yazdiran kodu yaziniz.
        int num =-20;

        if(num>0){
            System.out.println("Pozitif Sayi");//Pozitif Sayi
        }
        System.out.println("*****************");

        //Ex: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz.
        //0 1 2 3 4 5 6 7 8 9

        int number = 12;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Ex: sayi 3 basamakli ise ekrana "Sayi 3 Basamaklidir" yazdiriniz.

        int n = -234;
        /*
        Math Classi onemli bir classtir.Icerisinde bircok method barindirir.
        abs() methodu da icerisine arguman olarak verilen sayinin mutlak degerini
        yani pozitif halini verir.
         */
        n = Math.abs(n);
        if (n>99 && n<1000){
            System.out.println("Sayi 3 Basamaklidir");
        }
        System.out.println("****************");
        Math.min(5,9);
        System.out.println(Math.min(5,9));

        //String str = "abbccdc" tekrarsız karakterleri ekrana yazdiriniz.
        String s = "abbccdc";
        char c = s.charAt(0);
        if (s.indexOf(c)==s.lastIndexOf(c)){
            System.out.println(c);
        }
        char c1 = s.charAt(1);
        if (s.indexOf(c1)==s.lastIndexOf(c1)){
            System.out.println(c1);
        }
        char c2 =s.charAt(2);
        if (s.indexOf(c2)==s.lastIndexOf(c2)){
            System.out.println(c2);
        }
        char c3 = s.charAt(3);
        if (s.indexOf(c3)==s.lastIndexOf(c3)){
            System.out.println(c3);
        }
        char c4 = s.charAt(4);
        if (s.indexOf(c4)==s.lastIndexOf(c4)){
            System.out.println(c4);
        }
        char c5 = s.charAt(5);
        if (s.indexOf(c5)==s.lastIndexOf(c5)){
            System.out.println(c5);
        }
        char c6 =s.charAt(6);
        if (s.indexOf(c6)==s.lastIndexOf(c6)){
            System.out.println(c6);
        }
        //a d








    }//main
}//class
