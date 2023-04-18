package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //****************ExplicitNarrowing*****************
        /*
        Explicit Narrowing yaparken dikkat edilmeli cunku cok ciddi Data
        kaybı hatta datanin degismesine neden olabilir.
        Eger sayimiz donusturmeye calistigimiz variable in sınırlari dısında ise
        java sayiyi mod islemine alir ve kalani yazdirir.
        Kalan bölenin yarisindan fazla ise kalan sayiyi java
        kücültmek ister ve bolumu bir buyuterek kalani eksi(-) isaretli
        olacak sekilde yazdirir.


         */

        //short data type inde variable olusturup byte data typina ceviren kodu yaziniz
        short num =260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte); //4

        short num2=1023;
        byte num2Byte= (byte) num2;
        System.out.println("num2Byte = " + num2Byte); //-1

        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte); //-24

        int intSayi=8880;
        short shortSayi= (short) intSayi;//32768+32768+0
        System.out.println("shortSayi = " + shortSayi);//8880




    }
}
