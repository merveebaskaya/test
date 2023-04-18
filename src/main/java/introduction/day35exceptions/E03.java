package introduction.day35exceptions;

public class E03 {

    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s,2);
        getCharFromString(s,4);

    }

    public static void getCharFromString(String s, int idx){
        //Stringlerde olmayan bir index kullanildiginda java StringIndexOutOfBoundsException atar.
       try {
           char ch = s.charAt(idx);
           System.out.println(ch);
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Olmayan index kullandiniz==>" +e.getMessage());
           System.out.println(e.getCause());//null
           e.printStackTrace(); //tum detaylari veriyor hatani
       }
        System.out.println("try catch method gorev tamamlandi");

    }

}
