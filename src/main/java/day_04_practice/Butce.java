package day_04_practice;

public class Butce {
    // Tum aile uyelerinin birikiminin
    // bulundugu ortak ihtiyaclar icin
   // kullanildigi bir butce ile kisisel
   // harcamalarin yapildigi
  // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.


    public static int butce;
    public int harclik;

    public void maasAl(int alinanMaas){
        butce += alinanMaas; //butce = butce + alinanMass;
    }

    public void harclikAl(int alinanHarclik){
        butce -= alinanHarclik; //ortak Hesaptan Harclik Alinir
        harclik += alinanHarclik;
    }

    public void butcedenHarca(int harcanacakPara){
        butce -= harcanacakPara;
    }
    public void harcliktanHarca(int harclikHarcamasi){
        harclik -= harclikHarcamasi;
    }




}
