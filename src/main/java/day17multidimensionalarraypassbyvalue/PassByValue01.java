package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    /*
    Method olusturmak icin asagidaki 5 adimi takip ediniz;
    1)access modifier
    2)return type
    3)method ismi
    4)method parantezi
    5){} parantezlerimethod body si icin

    Note: Main methodun icindeki tum methodlar static olmalidir.
    Bir methodu static yapmak icin access modifier ile return type in arasina
    static yazmak yeterlidir.

    pass by value:
    1)Java "Pass by Valur" kullanir.
    2) Yani; Java methodlarin orjinal degerin degismesine musade etmez.
    3)Java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayı methoda yollar
    method kopya deger üzerinde degisiklik yapar, böylece orjinal deger korunmus olur.
    4)Java esnek bir dildir.Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
    bakiniz line 32

    Pass by Referans:
    1)Pass by Referance do method'a referance yollanir.
    2)Referans adres demektir.Adres yollaninca method adresi kullanarak orjinal degere ugrasır
    ve orjinal degeri degistirir.
    Bu yüzden c# gibi pass by reference kullanan yazilim dillerinde method
variable nin orijinal  degerini degistirir,
     */
    public static void main(String[] args) {

        int shirtPrice = 200;

        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println(shirtPrice);


    }

    //Discount(Indirim yapmak) method'u olusturunuz.
    public static int discount(String type, int price){
        switch(type){
            case "student":
            price = price -20;
            break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price -30;
                break;
            default:
                price = price;
        }
        return price;
    }


}
