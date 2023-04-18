package qamentor;

public class Loops_01 {

    public static void main(String[] args) {

       // Ekrana 5 kere "Hi" yazdiriniz
        for (int i = 1; i <6 ; i++) {
            System.out.println("Hi");
        }

        //4'den 24'e kadar tum tamsayilari ayni satirda aralarinda bosluk birakarak konsola yazdirin.
        for (int i = 4; i <25 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Example 2 : 11'den 14'e kadar tum sayilari ekrana yazdiriniz
        for (int i =11; i <15; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        //Ex 3:40 dan 23 e kadar tüm cift sayilari ekrana yazdiriniz.
        for (int i = 40; i >22 ; i--) {
            if (i%2==0){
                System.out.print(i + " ");


            }
        }
        System.out.println();
        //Example 4:18 den 56 ya kadar tum tek sayilari ekrana yazdirin.

        for (int i = 18; i <57 ; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example 1: 21 de 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yazdiriniz.

        for (int i = 21; i <181 ; i++) {
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();


        //Size verilen kucuk harfle yazilmis String'in cift sayi olan characterlerini buyuk harfe donusturunuz.
        //miami ==> MiAmI
        String s = "istanbul";

        for (int i = 0; i <s.length() ; i++) {
            String ch =s.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //hello java ==> hello j
        String t = "Hello Java";

         for (int i=0;i<t.length();i++){
             char ch = t.charAt(i);
             if (ch=='a'){
                 break;
             }else{
                 System.out.print(ch);
             }
         }
        System.out.println();
        //Verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //Tokatci==>ict
        String u = "Tokatci";

        for (int i=u.length()-1; i>=0 ;i--) {
            char ch = u.charAt(i);
            if (ch=='a'){
                break;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();

        //Verilen bir String'de kucuk harfleri konsola yazmayiniz.
        //"Pwd12?Ab"==>P12?A

        String v = "Pwd12?Ab";

        for (int i = 0; i <v.length() ; i++) {
            char ch =v.charAt(i);
            if (ch>='a' && ch<='z'){
               continue;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz.
        //"Java" ==> avaJ
        String a = "Java";
        String ters = "";
        for (int i =a.length()-1 ; i>=0; i--) {
            char ch = a.charAt(i);
            System.out.print(ch);
        }
        System.out.println();

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz.
        //578 ==> 5+7+8=20
        int sum = 0;

        int n = -578;
        n=Math.abs(n);
        for (int i=n; i>0; i/=10){
            sum += i%10;
        }
        System.out.println(sum);





    }


}
