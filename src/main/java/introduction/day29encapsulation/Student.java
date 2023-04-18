package introduction.day29encapsulation;

public class Student {

    //Encapsulation ==> kelime anlami itibari ile kapsullemek demektir.
    //Encapsulation Data Hiding (==>Veri saklamak)
    //Data nasil saklanir?
    //Access Modifierlarini private yaparak datayi diger classlarda gorunmez hale getiririm boylece datayi saklarim.

    private String stdId = "AC20231021";

    public int age =19;
    private double notOrt =3.53;
    private boolean succesful = false;

    //Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz.
    //Nasil okuruz?
    //"get method" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz.

    //get method'lar public olur.
    //get method'un return type'i okudugu variable'in return type'i ile ayni olur.
    //get method bir boolean variable icin olusturulduysa eger ismi "is" ile baslar.


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
    /*
    Encapsulation yaptigimiz datayi istersek digerclasslardan degistirebiliriz
    Nasil degistirebiliriz?
    "set method" olusturarak encapsula ettigimiz datanin degerini degistirebiliriz.
       a)set methodlari her zaman "public" olur.
       b)set methodlarin return type i her zaman void olur.
       c)set method parametre kullanir, parametrenin data type i variable ile ayni olmak zorundadir.

    ==>set method kullanarak var olan object uzerinde degisiklikler yaparak o objeyi sanki yeni bir
    object mis gibi kullanabiliriz.

    get methodlarin diger adi "getter", set methodlarin diger adi "setter"dir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
