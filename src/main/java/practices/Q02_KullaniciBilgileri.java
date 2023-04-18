package practices;

public class Q02_KullaniciBilgileri {
    /*
    first name, last name ,age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir
    First name: ...
    Last name: ...
    Age: ...
    Height:...
    Weight:...
    Not: sadece bir adet "system.out.println(); kullanınız.
     */
    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Can";
        byte age =15;
        double height = 1.4;
        double weight = 45.6;

        System.out.println("First Name:" + firstName+ "\nlast Name:"+ lastName+"\nAge:" + age+"\nHeight:"+height+ "\nWeight:"+ weight);

    }
}
