package introduction.day03scanner;

public class Car {

    //variable'lar olısturalım
    public String model = "Corolla" ;
    public int fiyat = 20000;

    //Method'lar olusturalim
    //Note:"return type void" oldugunda method icinde "return" keywordu kullanılmaz
    //eger bir method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa return type ı void olur
    public void hareket(){
        System.out.println("Corolla hizli hareket eder...");
    }

    public void dur(){
        System.out.println("Corolla guvenli bir sekilde durur...");
    }



}
