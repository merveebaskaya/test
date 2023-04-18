package qamentor;

import java.util.Scanner;

public class Day07Loop {
    //Ayni adimlar tekrar tekrar yapilmasi gerekiyorsa ""Loop" kullaniriz.
    // 4 adet Loop vardir.
    //1)for-loop 2)While loop 3)do while loop 4)for-each loop

    public static void main(String[] args) {
        //for loop
       // for (baslangic degeri; calisma sarti; artirma-azaltma){
       //     kodlar
       // }
        //Soru 1) Ekrana 10 kez "Seni yenecegim Java" yazdirin.
        for (int i=1; i<11;i++){
            System.out.println("Seni yenecegim Java");
        }

        //Soru 2)10 ile 30 arasindaki (10 ve 30 dahil)sayilari arasindavirgul olarak bana yazdir
        for (int i=10; i<31; i++){
            System.out.print(i +",");
        }
        System.out.println();

        //soru 3) 100 den baslayarak 50 ye kadar (50 dahil)olan sayilari aralarinda virgül olarak ayni satirda yazdir
        for (int i=100; i>49; i--){
            System.out.print(i + ",");
        }
        System.out.println();

        ////Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den başlayarak girilen sayiya kadar 3'un
        // veya 5"in kati olan sayilari yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("100 den kucuk bir tamsayi giriniz");
        int sayi = input.nextInt();

        for (int i=1; i<sayi; i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Soru 6) Interview Question
        //Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den başlayarak
        //girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //- şayi 3'un kati ise şayi yerine "Java" yazdirin.
        //- şayi 5'in kati ise şayi yerine "Güzeldir" yazdirin.
        //- şayi hem 3'un hem 5'in kati ise şayi yerine "Java Güzeldir" yazdirin.


        System.out.println("100 den kucuk bir tamsayi giriniz");
        int tamSayi = input.nextInt();

        for (int i=1; i<tamSayi; i++){
            if (i%3==0 && i%5==0){
                System.out.println("Java Guzeldir");
            } else if (i%3==0) {
                System.out.println("Java");
            } else if (i%5==0) {
                System.out.println("Guzeldir");
            }else {
                System.out.println(i);
            }
            // Soru 7 Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
            //1838 ==> 1 + 3 = 4
            System.out.println("Bir tamsayi giriniz");
            String s = input.next();
            int sum = 0;
            for (int k=0; k<s.length(); k++){
                String a = s.substring(k,k+1);
                if (s.indexOf(a)==s.lastIndexOf(a)){
                    sum = sum + Integer.valueOf(a);
                }
            }
            System.out.println(sum);





        }



    }
}
