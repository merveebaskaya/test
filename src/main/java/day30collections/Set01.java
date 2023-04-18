package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {

    /*
    1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2) 3 tane Set Class vardir;
       i)HashSet Class:
         "Hash" benzersiz id olusturma teknigidir.Bu teknige "Hashing Technique" denir.
         "HashSet" elemanlari rastgele siralar.
         "HashSet" elemanlari siralamadigindan cok hizli calisir.
         "HashSet" null'i eleman olrak kabul eder.
         "HashSet" tekrarsiz eleman depolamak icindir.
       ii)LinkedHashSet Class:
         "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
         "HashSet"lere gore yavastirlar.
         "LinkedHashSet" tekrarsiz eleman depolamak icindir.
       iii)TreeSet Class:
       "TreeSet"ler elemanlari natural order'a gore dizerler.
        "TreeSet"ler elemanlari natural order'a gore dizdiklerinden coook yavastirlar.
        En yavas Set "TreeSet"tir.
    3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz..
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(); //nonprimitive data tipi kullanirlar.

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt"); //Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece 1 kere ekler.
        hs.add(null);
        hs.add(null);


        System.out.println(hs); //[null, Zeki, Ajda, Cuneyt, Esra, Ezel]

        System.out.println(hs.hashCode()); //2038751948 Java her data icin tekrasiz bir id(hashcode) uretir bakar hashsete ulasır

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);

        System.out.println(lhs); //[234, 87, -32, 124, null]


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls); //[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs); //[87, 124] ==>LinkedHashSet'teki farkli elemanlari silindi.
        System.out.println(ls); //[451, 87, 231, 124] ==>2.ye karısmadi yazdirdi.

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); ==> TreeSet'lere null eklenemez.alfabetik sıraya koyuyor onu nereye koyacagını soylemiyor hata veriyor.
        System.out.println(ts); //[A, G, R, U, Z]

        System.out.println(ts.first()); //A
        System.out.println(ts.last()); //Z

        System.out.println(ts.lower('R')); //G ==>verilen eleman olan R'den onceki elemani verir.
        System.out.println(ts.lower('D')); //A
        System.out.println(ts.lower('A')); //null

        System.out.println(ts.higher('K')); //R ==>verilen eleman olan K'dan sonraki elemani verir.

        System.out.println(ts.headSet('R')); //[A, G]==> Parantez icindeki R dahil degildir.
        System.out.println(ts.headSet('R', true));//[A, G, R]

        System.out.println(ts.tailSet('G'));//[G, R, U, Z]==>Parantez icindeki G dahildir.
        System.out.println(ts.tailSet('G', false)); //[R, U, Z]==>Parantez icindeki G dahil degildir.

        System.out.println(ts.ceiling('R')); //R==>Eleman set'in icinde varsa elemanin kendisi return eder
        System.out.println(ts.ceiling('K')); //R==>Eleman set'in icinde yoksa sonraki eleman return eder.

        System.out.println(ts.floor('G')); //G==>Eleman set'in icinde varsa elemanin kendisi return eder
        System.out.println(ts.floor('J')); //G==>Eleman set'in icinde yoksa sonraki eleman return eder.

        System.out.println(ts.subSet('G', 'Z')); //[G, R, U]==>Ilk parametre dahil,ikinci parametre haric.
        System.out.println(ts.subSet('G', false, 'Z', true)); //[R, U, Z]


    }
}
