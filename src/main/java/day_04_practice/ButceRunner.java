package day_04_practice;

public class ButceRunner {

    public static void main(String[] args) {
        Butce baba = new Butce();
        System.out.println("Maas oncesi Butce"+Butce.butce);
        baba.maasAl(30000);
        System.out.println("Maas sonrasi Butce"+Butce.butce);
        baba.harclikAl(100);
        baba.harcliktanHarca(80);
        System.out.println(Butce.butce);

        Butce anne = new Butce();
        anne.maasAl(50000);
        anne.harclikAl(500);
        anne.harcliktanHarca(500);
        System.out.println(Butce.butce);
        System.out.println(anne.harclik);

        Butce cocuk = new Butce();
        cocuk.harclikAl(200);
        cocuk.harcliktanHarca(180);
        System.out.println(Butce.butce);
        System.out.println(cocuk.harclik);


    }//main
}
