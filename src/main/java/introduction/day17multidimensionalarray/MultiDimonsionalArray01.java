package introduction.day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimonsionalArray01 {
    public static void main(String[] args) {
        //bir arrayin elemanlari array ise bu array multidimensional arraydir
        //multidimensional array nasil olusturulur?
        int a[][] = new int[3][2];

        //MultiDimensional Arraylere eleman nasil eklenir?

        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;
       //MultiDimensional Arrayleri yazdirmak icin deepToString() methodunu kullaniriz.
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //MultiDimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);//45

        //MultiDİmensional Array icindeki array nasil yazdirilir?

        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));

        //MultiDimensional array kisa yoldan nasil olusturulur?

        String students[][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz

        int sum = 0;
                       //{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan,Kayahan"}
        for (String[]  w: students ){

            sum = sum + w.length;
        }
        System.out.println(sum);//8

        //Example 2: Yukaridaki students arrayinde icinde "m" olan isimleri console'a yazdiriniz.

        for (String[] w : students) {
            for (String  k :w) {
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //Example 3: Bir integer multidimensional array olusturunuz,tum elemanlarin carpimini hesaplayiniz.
        int nums[][]={ {5,4},{2,3,2},{7}};
        int result = 1;
        for (int[] w : nums){
            for ( int k :w){
                result = result*k;
            }
        }
        System.out.println(result);



    }
}
