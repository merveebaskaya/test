package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /*
        1)Array, Java'nin ayni data tipinde coklu data depolamak icin olusturdugu bir yapidir.
        2)Arrayler "primitive data type"leri veya "reference"lar ile çalisir.
        3)Array'lerin "super fast"dir ve "memory'de cok az yer" kaplarlar.
         */

    public static void main(String[] args) {

        //Array nasil olusturulur*
        String stdNames[] = new String[5];

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]<==nuller stringin default degerleridir.

        //Array'a nasil eleman eklenir?(Arraylar index kullaniyor.)
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //Array'deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);//Cuneyt

        //Example 1: stdNames Array'indeki her ismin sonuna * koyarak console yazdiriniz.
        //1.Way:
        for (int i=0; i<stdNames.length; i++){//length String'lerde parantezli(method) Array'lerde parantezsiz(method degil) kullanilir.

            System.out.println(stdNames[i] + "*");

        }
        //2.Way: for-each loop==>Enhanced(Zenginlestirilmis) Loop - Mumkunse hep for-each loop kullanin degilse digerlerini kullanin.

        for (String w : stdNames){

            System.out.println(w + "*");

        }
        //Example 2: Bir Integer Array olusturunuz,5 eleman ekleyiniz, elemanlarin toplamini bulup konsola yazdiriniz.

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]

        ages[0]= 12;
        ages[1]= 23;
        ages[2]= 9;
        ages[3]= 38;
        ages[4]= 27;
        System.out.println(Arrays.toString(ages));//[12, 23, 9, 38, 27]

        int sum = 0;

        for (int w : ages){

          sum = sum + w;

        }

        System.out.println(sum);//109

        //Example 3: Bİr char Array olusturunuz, 3 eleman ekleyiniz,elemanlarin carpimini bulunuz console yazdiriniz.

        char initials[] = new char[3];

        initials[0] = 'J'; //74
        initials[1] = 'P'; //80
        initials[2] = 'A'; //65
        System.out.println(Arrays.toString(initials));

        int carpim = 1; //çarpmanin etkisiz elemani
                              //[J, P, A]
        for (char w : initials){

            carpim = carpim*w;
        }
        System.out.println(carpim); //384800











    }
}
