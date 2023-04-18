package introduction.day34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line); //[Egg, Milk, Meat, Orange, Tomatoes]

        //Queue bir interface dir bu yuzden constructor i yoktur, dolayisiyla object olustururken new keyword'undan sonra kullanilamaz
        //Data type "Queue" olan bir object olusturmak icin new keyword'undan sonra iki ihtimaliniz var;
        //   a)Linkedlist veya  b) PriorityQueue classlaei kullanilir
        // Queue olustururken constructor olarak priorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama hakkınız olur.

        //Deque ==> Double ended queue ==>iki uclu kuyruk
        //Deque'daki add(), get(), peek, poll(), remove() methodlari first-last seklinde iki uclu olarak bulunur.

        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d); //[Milk, Meat, Egg, Orange, Tomatoes]
    }
}
