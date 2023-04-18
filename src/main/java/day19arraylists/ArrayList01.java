package day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    /*
    1)Ayni data type'indeki coklu datalari depolamak icin Array kullaniriz.
    2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisi en basta belirlemek zorundayiz.
    3)Array'ler eleman sayisinda esnek degildirler bu yuzden Java "ArrayList" adinda yeni bir yapi olusturdu
    bu yapi eleaman sayisinda esnektir..Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar bin koyarsaniz
    eleman sayisini 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List"de diyebiliriz.
    5)Java ArrayList leri olusturduktan sonra Array'leri iptal etmedi cunku;
       i)Array'ler hizlidir.
       ii))Array'ler memory'de az yer kaplar.
    6)Array'ler primitive data type'lari ve referance'lari depolayabilir ama ArrayList'ler non-primitive data type'lari
    depolar bu yuzden ArrayList'ler Array'lerden daha cok yer kaplar.


     */
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList console'a nasil yazdirilir?
        System.out.println(ages);//[ ]

        //ArrayList'e eleman nasil eklenir?
        //1.way:
        ages.add(12);
        ages.add(24);
        ages.add(9);//add() methodu elemanlari giris sirasina(insertion order) gore list'e yerlestirir
        System.out.println(ages);//[12,24,9]

        //2.way:
        ages.add(1,99);
        System.out.println(ages);//[12,99,24,9]

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.way:addAll() method'u bir lis'i diger list'in icine yerlestirir
        ages.addAll(price);
        System.out.println(ages);//[12,99,24,9,23,33]

        //4.way:
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'te eleman sayisi masil bulunur?
        int numOfElement = ages.size();//size() methodu bir ustteki eleman sayisini verir.
        System.out.println(numOfElement);

        //ArrayList'te specific bir eleman nasil alinir?
        int el1 = ages.get(3);//get()method'u index kullanarak istedigimiz methodu almaya yarar.
        System.out.println(el1);//23

        //ArrayList'te specific bir eleman nasil degistirilir?
        ages.set(6,111);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

        //ArrayList'te specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r1 = ages.contains(99);
        System.out.println(r1);//true

        //Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        //Bir ArrayList'teki tum elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);//[]

        boolean r3 = ages.isEmpty();
        System.out.println(r3);//true

        //Example1: Bir list'in bos olup olmadigini kontrol eden kodu yaziniz?
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");


        //1.way:
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        //2.way:
        if (names.isEmpty()){
            System.out.println("List bostur");
        }else {
            System.out.println("List'te wn az bir eleman vardir.");
        }












    }

}
