package introduction.day13incrementdecrement;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1:Verilen bir String de ilk "a" harfinden onceki tum karakterleri consol'a yazdiriniz.
        //      "I Love Java" ==> "I Love J"
        
        String s = "I love Java";

        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);
            if(ch=='a'){
                break;
            }

            System.out.print(ch);
        }
        System.out.println();

        //Example 2: Verilen bir String ile son 'a' dan sonraki tum karakterleri ters sirada yazdiriniz.
        //"Germany" ==>yn

        String t = "Germany";

        for (int i = t.length()-1; i >= 0 ; i--) {
            char ch =t.charAt(i);
            if (ch=='a'){
                break;
            }

            System.out.print(ch);

        }


    }
}
