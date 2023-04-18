package introduction.day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        //1.yol:
        long t1 =System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("g@gmail.com");
        emails.add("x@gmail.com");
        emails.add("e@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]

        long t2 =System.nanoTime();

        //2.yol:

        HashSet<String> emailHs = new HashSet<>();
        emailHs.add("a@gmail.com");
        emailHs.add("t@gmail.com");
        emailHs.add("g@gmail.com");
        emailHs.add("x@gmail.com");
        emailHs.add("e@gmail.com");
        emailHs.add("b@gmail.com");
        emailHs.add("c@gmail.com");

        TreeSet<String> emailTs = new TreeSet<>(emailHs);
        System.out.println(emailTs);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]
        //ikinci yol cok daha hizli calisir.
        //TreeSet her bir eleman ekleme isleminde tekrar tekrar siralama yapiyor.o yuzden cok yavas.
        //Hashsetin hizini kullandık datayı olusturduk Treeset e koyunca siralama yapti.hizlandi

        long t3 =System.nanoTime();

        System.out.println(t2-t1); //Treesetin calisma suresi 2667600
        System.out.println(t3-t2); //Hashsetin calisma suresi 313500


    }
}
