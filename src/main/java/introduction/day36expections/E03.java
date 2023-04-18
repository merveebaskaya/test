package introduction.day36expections;

public class E03 {
    public static void main(String[] args) {
        Object obj = 13;
        try {
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.err.println("Her data type i her data type ine cevrilmez");
            //hata mesajini renkli olarak verir.
            //hataya dair mesajin okunabilirligini artirmak icin System.err.println kullanilabilir.
            //Ayrica bu sekilde yazdirdigimizda Java error mesajlarini ayri bir yerde depolar.
        }

        //Birbirine donusturulemeyecek data type'larini donusturmekte ısrar ederseniz Java ClassCastException atar.


    }
}
