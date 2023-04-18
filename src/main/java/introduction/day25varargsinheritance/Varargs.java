package introduction.day25varargsinheritance;

public class Varargs {

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(3,6));
        System.out.println(add(5, 2, 7));

        getInitials("Ali Can", "Kemal Han");

    }
    //1)Bir method parantezinde birden fazla Varargs kullanilamaz.
    //2)Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir.

    public static int add(int... a){
        int sum = 0;
        for (int w : a){
           sum = sum+w;
        }
        return sum;
    }


    // toplama islemi yapan bir method olustur.
    //Asagidaki gibi farkli method olusturarak dynamic cozum uretemeyiz.
    //Cunku kullanici farkli sayidaki sayilari toplamak her zaman isteyebilir
    //Her ihtimal icin bir method olusturmak mumkun degildir.
    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu ve
    // bu yapiya "Varargs" deriz.
    //Varargs arka planda Array yapisini kullanir.
   /* public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    */
    //Example:  Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //           Ali Can ==> AC    Kemal Han ==> KH
    public static void getInitials(String... s){
        String initials = "";

        for (String w : s){
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }

}
