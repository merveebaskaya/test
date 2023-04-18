package day_15_practice;

public class Ustabasi extends Isci{

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Ustabasi ustabasi1 = new Ustabasi();

        ustabasi1.isim="Murat"; //personel class'ından
        ustabasi1.soyisim="Gokcek"; //personel
        ustabasi1.saatUcreti=15; //muhasebe
        ustabasi1.maas=ustabasi1.maasHesapla();//muhasebe
        ustabasi1.statu="Isci"; //muhasebe
        ustabasi1.isciStatu="Ustabasi"; //Isci class'ından

        ustabasi1.mesai(); //Isci class'ından

        System.out.println(ustabasi1.isim);

        System.out.println(ustabasi1.toString());








    }



}
