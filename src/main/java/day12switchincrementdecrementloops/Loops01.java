package day12switchincrementdecrementloops;

public class Loops01 {

    public static void main(String[] args) {
        /*
        Code yazarken i)Tekrarli code yazmamaya dikkat ediniz.
                      ii)Yazdiginiz kodun gerektiginde tamir edliebilmesinin kolay olmasina dikkat ediniz.
                      iii)Yazdiginiz code un gelistirilebilmesinin kolay olmasina dikkat ediniz.
                      iv)Yazdiginiz kodun farklı senaryolar icinde çalisabilmesine dikkat ediniz.
         */
        //Ekrana 5 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Yukaridaki gibi tekrar gerektiren isleri yapmak icin "loop" yapilarini kullaniriz.
        //4 tane loop yapisi var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //for-loop
           //Starting Value ; Loop Condition ; Increment/Decrement
        for (   int i =1    ;    i<6         ;      i++           ){
            System.out.println("Hi");
        }
        //4'den 24'e kadar tum tamsayilari ayni satirda aralarinda bosluk birakarak konsola yazdirin.
        for (int i=4; i<25 ; i++ ){//i++, i+=1, i=i+1
            System.out.print(i + " ");//4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
        }

        System.out.println();

        //33den 11 e kadar tum çft sayilar ayni satirda aralarinda bosluk birakarak konsola yazdirin.
        for (int i = 33; i > 10; i--) {

            if (i%2==0){
            System.out.print(i + " ");//32 30 28 26 24 22 20 18 16 14 12
           }
        }
        System.out.println();

        //Yazdiginiz kod baska sahada uzmanlik icermemeli
        for (int i = 32; i > 10; i=i-2){
            System.out.print(i + " ");
        }
        System.out.println();

        //20den 74 e kadar tum tek tamsayilari ayni satirda aralarinda bosluk bırakarak yazdiriniz.

        for (int i = 20; i <75; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        //Massachusetts kelimesindeki tum sesli harleri konsola yazdiriniz.

        String s = "Massachusetts";

        for (int i=0; i<s.length(); i++){

           char c = s.charAt(i);

           if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
               System.out.print(c + " ");
           }
        }


    }
}
