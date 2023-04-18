package introduction.day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi verir.
        LocalDate mycurrentDate = LocalDate.now();
        System.out.println(mycurrentDate);//2023-03-21

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = mycurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = mycurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = mycurrentDate.getDayOfMonth();
        System.out.println(dayValue);//21

        //Month bir Enum'dir.
        //Enum Java da sabit degerleri(Ay isimleri,Gun isimleri,Ulke isimleri..) depolamak icin kullanilir.
        Month monthName = mycurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        DayOfWeek dayName = mycurrentDate.getDayOfWeek();
        System.out.println(dayName);//TUESDAY

        //Ileriki tarihlere nasil gidilir?
        LocalDate newDate =(mycurrentDate.plusDays(13).plusMonths(1).plusYears(2));
        System.out.println(newDate);//2025-05-03 gun ekliyoruz


        //Gecmis tarihe nasil gidilir?
        System.out.println(newDate.minusYears(2).minusMonths(1).minusDays(13));//2023-03-21

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate date1 = LocalDate.of(1980, 8, 10);
        LocalDate date2 = LocalDate.of(1985,7,19);

        //Bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//true

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3);//false

        //Example1: Kullanicidan aldigimiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldigimiz tarih gecmise ait ise "Zmani girebilirsiniz" meaji veriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate +" Invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31

        //Example 2: Kullanicini girdigi tarihin gun ismini bulan kodu yazdirin.

        System.out.println("Please enter year,month and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());// Haftanin gun ismini veriyor.




    }
}
