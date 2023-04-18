package introduction.day19passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {
         /* Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile   orjinal degerin degismesini temin edebiliriz
        bakiniz line 24:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir


    * */

        int shirtPrice = 100;
        //burada pass by value sayesinde shirtprice degeri koruma altına alınır
       int studentShirtPrice = discount("student",shirtPrice);
       //methoda gonderirken degeri degil kopyasini gonderir degisen deger kopyasi olur orjinal degil
        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);
        System.out.println(discount("veteran", shirtPrice));
        System.out.println("shirtPrice = " + shirtPrice);

        shirtPrice = discount("senior",shirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);

    }
    public static int discount(String type,int price){
        switch (type){
            case "student" :
                price = price -10;
                break;
            case "veteran" :
                price =price -20;
                break;
            case "senior":
                price = price-5;
                break;
            default:
                price = price;
        }
        return price;
    }
}
