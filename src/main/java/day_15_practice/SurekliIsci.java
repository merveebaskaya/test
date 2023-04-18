package day_15_practice;

public class SurekliIsci extends Isci{

    @Override
    public String toString() {
        return "SurekliIsci{" +
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

        SurekliIsci surIc1 = new SurekliIsci();

        surIc1.persNo=5001;  //personal class'ından aldı
        surIc1.isim="Cem";   //personal class'ından
        surIc1.soyisim="Oz"; //personal class'ından
        surIc1.statu="Isci"; //muhasebe class'ından
        surIc1.saatUcreti=11;//muhasebe class'ından
        surIc1.maas=surIc1.maasHesapla(); //muhasebe class'ından

        System.out.println(surIc1.persNo); //5001

        System.out.println(surIc1.toString());






    }










}
