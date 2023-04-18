package introduction.day03scanner;

import introduction.day03scanner.Car;
import introduction.day03scanner.Student;

public class Runner {

    public static void main(String[] args) {

        //object nasil olusturulur?
        //Class Ismi + Object Ismi  +  Atama Operatoru + "new"  +  Constructor
           Car myCar              =             new        Car();

           //"new" keywordu sifirdan yeni bir obje olusturmak icin kullanilir.
        //constructor java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.

        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);

        tomHanks.feed();
        tomHanks.study();

        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade);



    }
}
