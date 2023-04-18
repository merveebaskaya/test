package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        Queue<String> warehouse = new LinkedList<>();

        warehouse.add("Milk");
        warehouse.add("Meat");
        warehouse.add("Bread");
        warehouse.add("Egg");
        warehouse.add("Cheese");
        System.out.println(warehouse); //[Milk, Meat, Bread, Egg, Cheese]

        warehouse.remove();
        System.out.println(warehouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.peek()); //Meat null verir eleman yoksa
        System.out.println(warehouse); // //[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.element()); //Meat hata verir eleman yoksa
        System.out.println(warehouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.poll());//Meat ilk elemanı verir ama siler eleman olmazsa null verir
        System.out.println(warehouse);//[Bread, Egg, Cheese]

        warehouse.clear();
        System.out.println(warehouse.poll());//null ilk elemani siliyor
        System.out.println(warehouse.remove()); //Exception eleman olmadigi icin hata verdi.ilk elemani siliyor.

        //warehouse.offer() //kapasite ayarlamasi yapmalısın. o kapasite bossa eleman alıyor




    }
}
