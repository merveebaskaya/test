package day21datetime;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(5, 2, 7));//14
        System.out.println(add(5, 2));//7
        System.out.println(add(5));//5
        System.out.println(add());//0

        getInitials("Ali Can", "Kemal Han","Tuncay Cınar", "Ibrahim Catal" );


    }
    //Example 1:Toplama islemi yapan bir method olustur.
    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz
    // cunku kullanici farkli sayidaki sayilari toplamak isteyebilir, her ihtimal icin method olusturmak mumkun degildir.
   // public int add(int a, int b){
   //     return a+b;
    //}

   // public int add(int a, int b, int c){
     //   return a+b+c;
    //}

    //public int add(int a, int b, int c, int d){
      //  return a+b+c+d;
    //}

    //Farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir.
    /*
    1)Bir method parantezinde birden fazla "Varargs" kullanilamaz.
    2)Bir method parantezinde birden fazla parametre kullanilacaksa "Varargs" sona konulmalidir.

   */
    public static int add(int... a){

        int sum =0;

        for (int w : a){
            sum = sum + w;
        }
        return sum;
    }

    //Example 2:Verilen isimlerin ilk harflerini console'a yazdiran methodu olusturunuz.
    //          Ali Can==>AC         Kemal Han==>KH
    public static void getInitials(String... s){

        String initials ="";

        for (String w : s){

           initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }

    }
}
