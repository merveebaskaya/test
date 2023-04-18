package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//String'in ters cevrilmesi loop'lar ile de yapilir bu kisa bir yoldur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//Verilen index'deki karakteri siler.
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//Baslangic index'inden(dahil) bitis index'ine(haric) kadar olan karakterleri siler
        System.out.println(sb1);//ysaeavaJ

        //Baslangic index'inden(dahil) bitis index'ine(haric) 3 karater yerine istersek 1 karakter istersek daha fazla karakter koyabiliriz
        sb1.replace(2,5, "X");//replace(2,5, "X")==>2 dahil,5 haric==>2,3,4 karakterleri yerine X koy demek
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,2023);//ilk 3 karakteri gec(bosver) sonrasina 2023 ekle demek.
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//Sonuc 0 ise alfabetik olarak ayni siradalar demektir.
                               //Sonuc mesela -3 ise sb2, sb3 den alfabetik olarak 3 onde demektir.
                               //Sonuc mesela 3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir.

        //StringBuilder nasil String'e cevrilir?
        //sb2.toString(); StringBuilderlari String e ceviriyor.String'deki methodlari kullaniyoruz.
        String str = sb1.toString().toUpperCase();
        System.out.println(str);//String YSX2023VAJ

        //String nasil StringBuilder'a cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);//String i tekrar String'e cevirdik.
        System.out.println(newSb1);//StringBuilder YSX2023VAJ



    }
}
