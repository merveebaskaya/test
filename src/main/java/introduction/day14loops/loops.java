package introduction.day14loops;

public class loops {
    public static void main(String[] args) {

        //Verilen bir Stringde kucuk harfleri console a yazdiriniz.
        //"Pwd12?Ab"==>P12?A
        String s = "Pwd12?A";

        for (int  i = 0; i < s.length() ; i++) {
          char ch = s.charAt(i);

          if (ch>='a' && ch <='z'){
              continue;
          }else {
              System.out.print(ch);
          }
        }
        //break ile continue arasindaki fark nedir?
        //break switch in disina cıkmak icin loopu kirmak icin kullanilir.
        //continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir.
        System.out.println();
        
        //Bir String i ters ceviren kodu yaziniz.
        //"Java"==>"avaJ"
        //1.yol
        String t = "Java";
        String ters = "";

        for (int i = t.length()-1; i >= 0; i--) {
            ters = ters + t.substring(i, i+1);
        }
        System.out.print(t);
        System.out.println();
        System.out.print(ters);

        System.out.println();
        //2.yol
        String u = "Java";
        String ters2 = "";

        for (int i = u.length()-1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.print(u);
        System.out.println();
        System.out.print(ters2);

        System.out.println();
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int sum=0;
        int num = -578;
        num = Math.abs(num);

        for (int i = num; i >0 ; i=i/10) {
            sum = sum + i%10;
        }
        System.out.println(sum);






    }
}
