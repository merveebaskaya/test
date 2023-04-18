package qamentor;

import java.util.Scanner;

public class day06Loops {

    public static void main(String[] args) {
        // Kullanicidan alinan bir tekrarsiz rakamlarinin toplamini bulunuz.
        //1838 ==>1+3=4

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        String s =input.next();

        int sum =0;

        for (int i=0; i<s.length() ; i++){
            String a = s.substring(i, i+1);
            if (s.indexOf(a)==s.lastIndexOf(a)){
                sum = sum + Integer.valueOf(a);
            }
        }System.out.print(sum);

        System.out.println();

        //Bir Stringdeki tekrarli karakterleri ekrana yazdiran kodu yaziniz.
        //Alabala ==> la

        String b = "Alabala";
        String c ="";

        for (int i =0; i<b.length(); i++){
            char ch = b.charAt(i);
            if (b.indexOf(ch)!=b.lastIndexOf(ch)&& !c.contains("" + ch)){
                c =c + ch;

            }
        }System.out.print(c);

        System.out.println();

        //3'den 8 'e kadar tum tamsayilari konsola yazdiran kodu yaziniz.
        int i=3;
        while(i<9){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String z="miami";
         int k =0;
         while (k<z.length()){
             String ch =z.substring(k,k+1);
             if(k%2==0){
                 System.out.print(ch.toUpperCase());
             }else {
                 System.out.print(ch);
             }
             k++;
         }
        System.out.println();
        //Size verilen tam sayinin rakamlari toplamini konsola yazdiran kodu yazdiriniz.
        int r= 578;
        r=Math.abs(r);
        int toplam=0;
        while(r>0){
            toplam = toplam + r%10;
           r= r/10;
        }
        System.out.println(toplam);
        System.out.println();

        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz.
        //3x1=3 3x2=6 3x3=9 .....3x10=30

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();

        int n = 1;
        while (n<11){
            System.out.println(sayi + "*" + n + "=" +  (sayi*n));
            n++;
        }
        System.out.println();

        //Kullanicidan aldiginiz Tringdeki sessiz harfleri konsola yazdiran kodu yaziniz.
        //Alabama==>lbm

        Scanner giren = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String d = giren.next();
        int e = 0;

        while (e<d.length()){
            char x = d.charAt(e);
            boolean y = x=='a' || x=='e' || x=='i' || x=='o' || x=='u'
                    || x=='A' || x=='E' || x=='I' || x=='O' || x=='U' ;
            if ( !y ){
                System.out.print(x);
            }
            e++;
        }




    }
}
