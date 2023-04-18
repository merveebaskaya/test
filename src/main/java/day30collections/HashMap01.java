package day30collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
MY NOTES:
Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
"key" kismi tekrarsiz, "value" kismi tekrarli olabilir.
Mapler "key" ve "value" structure'ini kullanir.
Map'lerdeki elemanlara "Entry" denir.
Elemanlarin tamamina ise "EntrySet" denilir.
"Entry"ler tekrarsiz kullanim oldugu icin "EntrySet" denilir.
Key ve Value'lar ayri ayri data type 'lerinde olabilirler
"Map"'ler collection degildir, farkli bir yapidir.

HashMapler "entry"leri rastgele siralar bu yuzden en hizli Map'dir.



 */

public class HashMap01 {

    public static void main(String[] args) {

        //Mapler nasil olsturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 300000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 8300000);
        countryPopulation.put("Netherland", 1800000);

        System.out.println(countryPopulation); //{Turkiye=8300000, Netherland=1800000, USA=400000000, Germany=83000000, Albania=300000}

        //get() methodu "key" ile calisir ve "value" kismini verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun "key"leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();  //key ile alakali set verecek tekrarsiz oldugu icin setin icine koyacak.
        System.out.println(keys);//[Turkiye, Netherland, USA, Germany, Albania]

        //Butun "value"lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values); //[8300000, 1800000, 400000000, 83000000, 300000]

        //Example 1: country population map'indeki ulkelerin nufuslarinin ortalamasi nedir?

        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (Integer w : value){
            sum = sum + w;
        }
        System.out.println(sum/value.size()); // ortalama nufusu verir

        //entrySet() "entry"leri kalip halinde alip bize "Set" icine koyarak verir.
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz
        Set<Map.Entry<String,Integer>> entries =countryPopulation.entrySet();
        System.out.println(entries); //[Turkiye=8300000, Netherland=1800000, USA=400000000, Germany=83000000, Albania=300000]

        //Example 2: countryPopulation ulkelerin isimlerinin character sayisi ile nufusunun toplamini bulunuz.

        int toplam =0;
        for (Map.Entry<String,Integer> w : entries){

            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);






    }
}
