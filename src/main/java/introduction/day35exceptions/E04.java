package introduction.day35exceptions;

public class E04 {

    public static void main(String[] args) {

        String arr [] ={"A","G","N","L"};
        getElementFromArray(arr,1);

        getElementFromArray(arr,5);
    }
    public static void getElementFromArray(String[] s, int idx){
        //Arraylerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar.
       try{
           String el = s[idx];
           System.out.println(el);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getCause()); //null
           System.out.println(e.getMessage());//Index 5 out of bounds for length 4
       }
        System.out.println("try-catch gorev tamamlandi");



    }

}
