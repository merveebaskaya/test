package qamentor;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class day07ArrayCalisma {
    public static void main(String[] args) {

        //Array nasil olusturulu?
        String stdNames [] = new String[5];
        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));

        //Arraye nasil eleman eklenir?
        stdNames[0]="Ajda";
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));

        //Arraydeki specific elemani nasil yazdirabilirz?
        System.out.println(stdNames[3]);

        //stdNames her ismin sonuna * koy
        //1.yol:
        for (int i=0; i<stdNames.length; i++){
            System.out.println(stdNames[i] + "*");
        }

        //2.yol for each loop ==>enhance loop(zenginlestirilmis) loop kullanin

        for (String w : stdNames){
            System.out.println(w +"*");
        }

        //example 2: ınteger array 5 eleman olustur opla konsola yazdir.

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages));

        ages[0]=12;
        ages[1]=23;
        ages[2]=9;
        ages[3]=38;
        ages[4]=27;
        System.out.println(Arrays.toString(ages)); //[12, 23, 9, 38, 27]

        int sum = 0;
        for (int w: ages){
            sum = sum + w;
        }
        System.out.println(sum);//109

        //3:bir char array 3 eleman ekle elemanların * yazdiriniz.

        char initials[] =new char[3];
        initials[0]='J';//74 ASCII degerini kullanir
        initials[1]='P';//80
        initials[2]='A';//65

        int carpim= 1;

        for (char w : initials){
            carpim = carpim*w;
        }
        System.out.println(carpim);//384800

        //Arrayleri kısa yoldan nasil olusturabiliriz?
        int grades[]={ 67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        //grades en kucuk ve en buyuk gradesin toplamini bulun.
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0]+grades[grades.length-1]);

        //2:size verilen String arraydeki isimlerden 5 karakterden az karakter icerenleri yazdir.

        String stdName [] = new String[5];
        stdName[0]="Ajda";
        stdName[3]="Cuneyt";
        stdName[2]="Tom";
        stdName[1]="Ayhan";
        stdName[4]="Filiz";

        for (String w:stdName){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Stringleri alfabetik siraya koy f harfi olanlaridan sonrasiniyazdırma
        Arrays.sort(stdName);

        for (String w: stdName){
            if(w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }
        //4.
        for (String w: stdName){
            System.out.println(w);

            if (w.startsWith("F")){
                break;
            }
        }

        //5.
        Arrays.sort(stdName);//natural order alfabetik ve kucukten buyuge sıralama
        for (String w: stdName){
            if (w.startsWith("F")){
                continue;
            }else {
                System.out.println(w);
            }
        }

        //5.soru kullanicini coklu datayi bir arraye yerlestirebilmesi icin gereken kodu yaziniz








    }
}
