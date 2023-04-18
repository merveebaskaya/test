package day_15_practice;

public class Isci extends Muhasebe{

    protected String isciStatu="Surekli Isci";

    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisabilir");
    }

    //Bu class'danda obje olusturabiliriz.Bu class'ın child classlarının olması obje olusturmaya engel degil.
    //fakar iscileri icin surekli isci ve ustabasi olmaktan baska ihtimal olmadigi icin isci classinda isci uretmeye gerek yok.



}
