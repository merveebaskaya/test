package day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;

    //Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Data'yi nasil saklarsin? Access Modifier'ini "private" yaparak.

    private String stdId = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz.
    //Nasil okuruz?"get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)get method'lari hep public olur  ii)get method'un "return type"i okudugu variable'in return type'i ile ayni olur
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.
    public String getStdId() {
        return stdId;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar.

    public double getGpa() {
        return gpa;
    }

    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz.
    //Nasil degistirebiliriz?"set method" olusturarak Encapsulation edilmis data'nin degerini degistirebiliriz.
    //Set methodlar hep public olur.
    //Get methodlarin return type'i hep void olur.
    //Set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir object'mis gibi kullanabiliriz
    //Note:getmethod'larin diger adi "getter", set methodlar'in diger adi "setter"dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
