package introduction.day36expections;

public class E04 {
    /*
    *throw keyword bir method bodysi icinde istedigimiz yerde,
    istedigimiz kosullar icin, istedigimiz kadar Exception atmamizi saglar.
    *throw keyword yazildiktan sonra bir Exception Class Object i olusturulur.
    * Exception class constructor inin parantez icine istedigimiz Exception mesajini yazabiliriz
    *
    * *throw ile throws keywordlari arasindaki fark nedir?
    1)"throw" method body si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
    2)"throw" method bodysi icerisinde istedigi yerde istedigi kadar kullanilabilir
      "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
    3)"throw"dan sonra "new" keyword ve constructor kullanilarak object olusturulur.
      "throws" dan sonra sadece Exception class ismi yazilir.
    4)"throw" belli sartlar icin Exception atmada kullanilir.
      "throws" ise applicationu Exceptiona attiktan sonra durdurur.
     */
    public static void main(String[] args) {
        printAge(160);

    }
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age>150) {
            throw  new IllegalArgumentException("Age 150 den buyuk olamaz");

        } else {
            System.out.println(age);
        }
    }
}
