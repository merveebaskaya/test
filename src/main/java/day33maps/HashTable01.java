package day33maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    "HashMap" ile "HashTable" arasindaki fark nedir?
    *i)"HashMap" "tread-safe" degildir "HashTable" "thread-safe"dir.
      "HashMap" "synchronized" degildir "synchonized" "thread-safe"dir.
    ii)"HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'ya musaade eder.
    "HashTable" key'lerde de value'larda da "null" kullanilmasina musaade etmezler.
    iii)"HashMap" hizlidir "HashTable" "hashMap" e gore yavastir.
    Note:"HashMap" ve "HashTable" ikiside entry'leri rastgele siralar.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        //stdAges.put(null, 85);==>HashTable'larin key'lerine null koyulamaz.
        //stdAges.put("Walker", 85);==>HashTable'larin value'larina null koyulamaz.

        System.out.println(stdAges); //{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}






    }
}
