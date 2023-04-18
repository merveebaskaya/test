package day_11_practice;

public class C04_Constructor {

    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak, farli bir class'dan deger ataması yapınız ve yazdırınız

    String marka;  //instance variable
    String model;
    int yil;
    String yakit;

    public C04_Constructor(String mrk, String mdl, int yl, String ykt) {

        marka=mrk; //Ayni isim verirsek this.marka yazariz.
        model=mdl;
        yil=yl;
        yakit=ykt;
    }
}
