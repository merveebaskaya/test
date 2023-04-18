package introduction.day34collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HahMap01 {

    public static void main(String[] args) {

        /*
        Map'Lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanimi vardir.
        "key" kismi tekrarsiz, "value" kismi tekrarli olabilir.
        Maplerdeki elemanlara "Entry" denir.
        Elemanlarin tamamina "EntrySet" denilir.
        Entryler tekrarsiz oldugu icin EntrySet denilir.
        "Key" ce "Value" lar ayri ayri data tiplerinde olabilirler.
        "Map"ler collection degildir.
        HashMapler entryleri rastgele siralar, bu yuzden en hizli map'tir.
         */

        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000}
        System.out.println(countryPopulation);

        //get() methodu key ile calisir ve value return eder.
        int germanyPopulation = countryPopulation.get("Germany");
        System.out.println(germanyPopulation); //83000000

        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys); //[Netherland, USA, Turkey, Germany, Albania]

        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 30000000]

        //Example1:CountryPopulation mapindeki ulkelerin nufuslari ortalamasi nedir?

        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w: value) {
            sum = sum + w;
        }
        System.out.println(sum/value.size()); //122800000

        //entrySet() mapteki entry'leri kalip halinde alip bize set olarak veriyor.
        //Looplar mapler ile kullanilamaz bunun icin entry set methodunu kullaniriz.

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println("entries = " + entries);

        //Example 2:countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufus toplamini bulunuz.

        int toplam = 0;
        for (Map.Entry<String,Integer> w:entries) {
            toplam = toplam +w.getKey().length() + w.getValue();

        }
        System.out.println(toplam); //614000033





    }
}
