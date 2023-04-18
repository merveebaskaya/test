package day_17_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    // Bir tane txt dosyası olusturunuz.
    // txt dosyasının icerisine cumleler yazınız
    // Olusturdugunuz txt dosyasına ulasınız.
    // icerisindeki cumleleri yazdırınız

    public static void main(String[] args)  {

        /*
        Bir code yazilirken olasi exceptionlari ongorup exception olustugunda
        javanin ne yapmasini istedigimize karar vermeliyiz.

        1-Eger exception olustugunda kodun devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception'u deklare ederiz.

        2-Eger exception olussa da kodun calismaya devam etmesini istiyorsak
        sorun olusturabilecek kodu try blogunun icine yazmaliyiz.

        catch bloguna ise exception durumunda javanin ne yapmasini istedigimizi yazmaliyiz.



     */



        String dosyaYolu = "src/main/java/day_17_practice/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k = 0;

            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
    /*
      Exceptionlar icin parent child iliskisi mevcuttur.
      Eger bir kod icin birden fazla exception olusma ihtimali varsa
      oncelikle olasi exceptionlar parent child iliskisi tasiyor mu bakmamiz gerekir.
      Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz.

      Eger parent child iliskisi varsa sadece parent exceptionu yazabiliriz
      veya ikisini de yazmak istersek child 'i once parent'i sonra yazmaliyiz.
     */
