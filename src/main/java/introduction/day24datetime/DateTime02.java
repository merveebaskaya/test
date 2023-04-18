package introduction.day24datetime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrenTime = LocalTime.now();
        System.out.println(myCurrenTime);//12:35:30.580358400

        //Anlik zamanda bileşenler nasil alinir?
        int hour = myCurrenTime.getHour();
        System.out.println(hour);//12

        int minute = myCurrenTime.getMinute();
        System.out.println(minute);//35

        int second = myCurrenTime.getSecond();
        System.out.println(second);//27

        int nano = myCurrenTime.getNano();
        System.out.println(nano);//54699200

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrenTime.plusMinutes(10).minusHours(1);
        System.out.println(next);//11:51:49.473697

        //Zaman formati nasil degistirilir?
        //DateTimeFormatter.ofPattern() methodu kullanarak degistirebilirsin.
        /*
        DateTime Class'ta kullanilan tarih saat formatlari;
        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi AM.PM gosterilmez.
        hh : mm a==> 12'li saat sistemi AM.PM gosterilir.
        hh : mm : ss ==> 12'li saat sistemi saniyeyi gosterir.
        HH : MM ==> yanlis format MM aylar icin kullanilir.
        mm minute demektir,MM month demektir.

        dd-MM-yyyy ==> gun- ay - yil
        MMM ==> Aug
        MMM ==> August

         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh : mm : ss a");
        String formattedMyCurrentTime = dtf1.format(myCurrenTime);
        System.out.println(formattedMyCurrentTime);//13:02

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);//2023-08-25

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/2023

        //Tarihi Gun / Ay isminin ilk 3 harfi verecek sekile ceviriniz 25/aug/23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Ağu/23

        //Tarihi 25/August/2023 tarihi sekline ceriniz.
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd*MMMM*yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/Ağustos/2023

        //Baska bir zaman dilimini nasil aliriz?

        //Tokya'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-03-21

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:36:39.036443300








    }
}
