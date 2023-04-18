package qamentor;

public class Day10MultiArray {


    //***************************************BİNARYSEARCH SORULARI*****************************************************

    /****SORU1; Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız
     // {"Apex", "is", "an", "object", "oriented", "programming", "language"};*/

    /*
    String name []={"Apex", "is", "an", "object", "oriented", "programming", "language"};

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));//[Apex, an, is, language, object, oriented, programming]
    int result= Arrays.binarySearch(name,"object");
        System.out.println(result);

        System.out.println();
    //************************************* SPLİT SORULARI******************************************************

    /****SORU2;İ)Kac kelime olduğunu bulunuz.
     ii)Kac harften olustuğunu bulunuz
     iii)Verilen bir String'de 'a' veya 'A' ile başlayan kelimenin sayısını bulunuz.*/
    String s="Apex is an object oriented programming language.";

    /*String s1[]= s.split(" ");
          for(String w:s1){
        if(w.startsWith("a")||w.startsWith("A")){
            System.out.println(w);
        }
    }
        System.out.println();
    // ************************** MULTİDİMENSİONAL SORULARI******************************************************

    /****SORU3:Student arrayında toplam kac isim oldugunu bulalım*/
   /* String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
    int toplam=0;
          for(String [] w:student){
        toplam+=w.length;
    }
        System.out.println(toplam);

        System.out.println();
    /***SORU4:Yukarıdaki student arrayında içinde "m" olan isimleri konsola yazdırınız.
     String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};*/


    /*    System.out.println();
    /***SORU5:Bir integer multidimensional arraydaki en küçük ve en büyük elemanın elemanın toplamını bulunuz*/
    /*int ages[][] = {{15,4 }, {12, 43, 21}, {7}};


        System.out.println();*/


    /****SORU6:Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
     Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
     (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10 */


     //   System.out.println();
    /***SORU7:String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
     alınız.Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM*/


     //   System.out.println();
    /***SORU8:Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
     bulunuz.
     Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2*/


     //   System.out.println();
    /*** SORU9: Verilen bir String'deki sesli harf sayısını bulunuz.
     String s = "Apex is an object oriented programming language";*/

     //   System.out.println();
    /***SORU10: İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.*/


     //   System.out.println();
    /***SORU11:iki boyutlu bir arrayı tek boyutlu bir arraya cevirin**************************/
   // int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};//==>{5,4,2,3,2,7} yapıcaz
}
