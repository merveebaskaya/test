package day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrenDate = LocalDate.now();
        System.out.println(myCurrenDate);//2023-03-15

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrenDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrenDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrenDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //Asagidaki "Month" bir Enum'dir.
        //Enum Java'da sabit degerleri(Ay isimleri,Gun isimleri,ulkedeki sehir isimleri,Samanyolu galaksisindeki gezegen isimleri) depolamak icin kullanilir.
        Month monthName = myCurrenDate.getMonth();
        System.out.println(monthName);//MARCH

        //Asagidaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName = myCurrenDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //ilerideki tarihe nasil gidilir?
        System.out.println(myCurrenDate.plusDays(5).plusMonths(2).plusYears(4));

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrenDate.minusYears(38).minusMonths(2).minusDays(18));//1992-12-28

        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);

        //Bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir?
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1);//true

        //Bir tarihin bir tarihten once olup olmadigini nasil kontrol edilir?
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2);//true

        //Bir tarihin bir tarihe esit olup olmadigini nasil kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);//false

        //Example 1 :Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tari girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year,month and day in order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }

        int lenghtOfMonth = myCurrenDate.lengthOfMonth();
        System.out.println(lenghtOfMonth);

        //Example 2:Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year,month and day in order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());


    }
}
