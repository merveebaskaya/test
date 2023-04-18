package ogrencisorucozumu;

public class AmstrongSayiSorusu {

    /*
    Amstrong sayilari bulan bir program yazalim.
    153 = (1*1*1)+(5*5*5)+(3*3*3)
    153=1+125+27=153
    153=153

    153 Bir Amstrong sayidir.
    370 Bir Amstrong sayidir.
    371 Bir Amstrong sayidir.
    407 Bir Amstrong sayidir.

    Basamaklara ayirma
    123%10=3 ==>birler
    123/10=12
    12%10=2 ==>onlar
    12/10=1
    1%10=1 ==>yuzler
     */

    public static void main(String[] args) {

        for (int i=100; i<1000; i++){
            int template=i;
            int birler, onlar, yuzler;
            //basamaklari ayirma
            birler = template%10;
            template/=10;
            onlar = template%10;
            template/=10;
            yuzler = template%10;

            //int toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler); veya
            double toplam = Math.pow(birler, 3)+ Math.pow(onlar,3)+Math.pow(yuzler, 3);

            if (toplam == i){
                System.out.println(i+ " Bir Amstrong Sayidir.");
            }
        }

    }
}
