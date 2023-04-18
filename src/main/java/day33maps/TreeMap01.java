package day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1)TreeMap "thread-safe" ve "synchronized" degildir.
    Note:Map'lerde "Multi thread" kullanmaniz gerektiginde sadece HashTable kullanabilrsiniz.
    2)TreeMap'ler value'larda null kullanimina musaade eder, key'lerde etmez.
    3)TreeMap entry'leri key'lerine gore natural ordar'a gore siraya koyar.Bu yuzden cok yavastir.
     */

    public static void main(String[] args) {

        TreeMap<String,Integer> countryPopulations = new TreeMap<>();

        long t1 = System.nanoTime();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",18000000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",80000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagascar", 30000000);

        System.out.println(countryPopulations);
        long t2 = System.nanoTime();

        HashMap<String,Integer> countryPop = new HashMap<>();

        countryPop.put("USA",400000000);
        countryPop.put("Netherland",18000000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",80000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagascar", 30000000);

        TreeMap<String, Integer> countryPop2 = new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);




    }
}
