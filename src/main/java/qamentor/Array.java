package qamentor;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        //Array nasil olusturulur?
        String stdNames[] = new String[5];
        String stdName[]= {};

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));

        //Array'a nasil eleman eklenir?(Arraylar index kullaniyor.
        stdNames[0]="Ali";
        stdNames[1]="Veli";
        stdNames[2]="Ayşe";
        stdNames[3]="Filiz";
        stdNames[4]="Cuneyt";

        System.out.println(Arrays.toString(stdNames));

        //Array'deki specific bir elemani nasil alabiliriz?

        System.out.println((stdNames[2]));

        //Example 1: stdNames Array'indeki her ismin sonuna * koyarak console yazdiriniz.

        for (String w : stdNames){
            System.out.println(w + "*");
        }

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az karakter icerenleri console yazdiriniz.

        for (String w : stdNames){

            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array'deki isimleri alfebatik siraya koyduktan sonra "F" ile baslayan
        // isimlerden önceki isimleri console'a yazdiriniz.
        Arrays.sort(stdNames);

        for (String w:stdNames){
            if (w.startsWith("F")){
                break;
            }System.out.println(w);
        }

        //Example 4: Size verilen bir String array'deki isimleri alfebatik siraya koyduktan sonra "F" ile baslayan
        // isimlerden önceki isimleri  ve "F" ile baslayanlari console'a yazdiriniz.

        Arrays.sort(stdNames);
        for (String w:stdNames){
            if (w.startsWith("F")){
                System.out.println(w);
                break;
            }
        }

        //Example 5: Size verilen bir String array'deki isimleri alfebatik siraya koyduktan sonra "F"ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz.
        Arrays.sort(stdNames);

        for (String w:stdNames){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }

        //Example 2: Bir Integer Array olusturunuz,3 eleman ekleyiniz, elemanlarin toplamini bulup konsola yazdiriniz.

        int eleman[]=new int[3];
        eleman[0]=9;
        eleman[1]=12;
        eleman[2]=23;

        int sum = 0;

        for (int w: eleman){
             sum =sum + w;
        }
        System.out.println(sum);

        //Example 3: Bİr char Array olusturunuz, 3 eleman ekleyiniz,elemanlarin carpimini bulunuz console yazdiriniz.

        char c[] = new char[3];

        c[0]='J';
        c[1]='P';
        c[2]='A';

        int carpim = 1;
        for (char w: c){
            carpim = carpim*w;
        }
        System.out.println(carpim);

        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gerek kodu yaziniz.
        /*
        1)Kullanicidan data almak icin Scanner object olusturur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyim.
        3)Arrray olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
        4)Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim

         */



    }
}
