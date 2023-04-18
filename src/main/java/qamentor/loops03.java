package qamentor;

public class loops03 {
    public static void main(String[] args) {
    //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
      //miami ==> MiAmI

        String s = "miami";
       for (int i=0; i< s.length(); i++){

           String ch = s.substring(i, i+1);
           if (i%2==0){

               System.out.print(ch.toUpperCase());

           }else {
               System.out.print(ch);
           }
       }
        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J

        String a = "Hello Java";
        for (int i =0 ; i<a.length(); i ++){
          char b = a.charAt(i);
           if (b=='a'){
               break;
           }else {
               System.out.print(b);
           }
        }
        System.out.println();

        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // "Tokatci ==> ict







        }









    }





