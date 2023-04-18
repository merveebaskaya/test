package day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1)Iterator'lar loop'larin yaptigi ayni isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iterator'lar ile loop'lar arasinda perfomans farki yoktur.
    4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
    5)İki tip iterator var; i)Iterator:Bu sadece eleman silmede kullanilir,
                                       eleman eklemek veya elemani degistirtmek mumkun degildir.
                            ii)ListIterator:Bu eleman silebilir, ekleyebilir ve degistirebilir.
                            Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir(for-each loop gibi)
                            "ListIterator" ise iki yonlu calisabilir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        //"Iterator" kullanalim.
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){//hasNext() pointer'a "senden sonra eleman var mı" diye sorar
                                //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustundan atladigi elemani return eder.

            myItr.remove();//next() methodunun return ettigi elemani siler.

        }
        System.out.println(myList); //[]

        //ListIterator kullanalim.
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");

        }
        System.out.println(yourList); //[Tom!, Jim!, Clara!, Angie!, Mark!]

        //hasPrevious() ve previous() nasil kullanilir?
        while (yourListItr.hasPrevious()){ //hasPrevious() senden once eleman var mi? true ya da false dondurur.

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);
        }

        System.out.println(yourList); //[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]
        /*
        hasPrevious() senden once eleman var mı true ya da false dondurur.Mutlaka imlec listenin sonunda olmalidir.
         */

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();

        while (ourListItr.hasNext()){

            String el = ourListItr.next();

            System.out.println(el);
        }

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list); //[5, 9, 2, 1, 17, 3]

        Iterator itr = list.iterator();
        //[(itr)5, 9, 2, 1, 17, 3]

        System.out.println(itr.hasNext()); //true
        System.out.println(itr.next());//5  [5, (itr)9, 2, 1, 17, 3]
        System.out.println(itr.next());//9   [5, 9, (itr)2, 1, 17, 3]
        itr.remove();
        System.out.println("list = " + list); //list = [5, 2, 1, 17, 3] en son 9 un uzerinden gecmisti onu sildi.
        //itr.remove();
        //System.out.println("list = " + list);
        /*
        remove() methodu uzerinden atladigi elemani siler.Ancak uzerinden atladigi eleman yoksa hata verir.
        IllegalStateException hatasi verir.Bu nedenler ust uste remove methodu calistirilmaz.
         */

        LinkedList<String> mList = new LinkedList<>();
        mList.add("Van");
        mList.add("Mus");
        mList.add("Kayseri");
        mList.add("Izmir");
        mList.add("Samsun");
        System.out.println(mList); //[Van, Mus, Kayseri, Izmir, Samsun]
        Iterator<String> mItr = mList.descendingIterator();
        while (mItr.hasNext()){
            String eleman = mItr.next();
            System.out.print(eleman + " "); //Samsun Izmir Kayseri Mus Van
        }




    }
}
