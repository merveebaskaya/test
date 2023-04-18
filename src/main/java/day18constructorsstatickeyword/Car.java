package day18constructorsstatickeyword;

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
    public Car(){

    }

    //Custom Constructor
        public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Custom Constructor


    public Car(String make) {
        this.make = make;
    }
    //Custom Constructor
    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }



}



