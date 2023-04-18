package day29collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    1)LinkedList'ler node silme ve ekleme'de cok basarili oldugu icin,
      silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedeList kullanilir.
    2)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
    Note: İhtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri) gibi LinkedList
         "search" islemleri yapacaksa (Amerika eyaletleri) gibi ArrayList kullaniriz.

     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");



        System.out.println(s);

       //s.remove(2);
        System.out.println(s);

        //s.remove("Ajdar");
        System.out.println(s);

        //s.remove();
        System.out.println(s);

        //s.removeFirstOccurrence("Esra");
        System.out.println(s);

        //s.removeLastOccurrence("Esra");
        System.out.println(s);



        String r1 = s.peek(); //ilk node silmeden size verir (copy+paste)
        System.out.println(r1); //Kemal
        System.out.println(s); //[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

         /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
        */

        String r2 = s.poll(); //ilk node size verir ve List'ten siler.(vut+paste)
        System.out.println(r2); //Kemal
        System.out.println(s); //[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Throws:NoSuchElementException – if this list is empty
        Note: peek() ile element() ikiside ilk elemani silmeden size verir
              Ama peek() list bos oldugunda size null verir, element() ise "hata" verir.

         */

        String r3 = s.element();//ilk elemani silmeden size verir(copy+paste)
        System.out.println(r3); //Esra
        System.out.println(s); //[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        removes and returns the first element of this list.
        Throws:NoSuchElementException – if this list is empty
         Note: poll() ile pop() ikiside ilk elemani silmeden size verir
              Ama poll() list bos oldugunda size null verir, pop() ise "hata" verir.
         */
        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);

        //hash set setlerin en hizlisidir hiz ihtiyaci
        //link hash set elemanlari sizin girdiginiz siraya gore dizer
        //treeset elemanlari natural order'a gore dizer



    }
}
