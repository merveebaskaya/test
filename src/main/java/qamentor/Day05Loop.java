package qamentor;

public class Day05Loop {
    public static void main(String[] args) {

        //4'den 24'e kadar tum tamsayilari ayni satirda aralarinda bosluk birakarak konsola yazdirin.

        for (int i=4; i<25; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //33den 11 e kadar tum çft sayilar ayni satirda aralarinda bosluk birakarak konsola yazdirin.

        for (int i=33; i>10; i--){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Massachusetts kelimesindeki tum sesli harleri konsola yazdiriniz.
        String s = "Ankara";
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E' ||c=='I' ||c=='U' ||c=='O'){
                System.out.print(c + " ");
            }
        }
        System.out.println();
        String  k = s.replaceAll("[^aeiouAEUIO]","");

        System.out.print(k + " ");
        System.out.println();

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        for (int i=21; i<181; i++){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String a = "miami";
        for (int i=0; i<a.length(); i++){
           String m =a.substring(i,i+1);
           if (i%2==0){
               System.out.print(m.toUpperCase());
           }else {
               System.out.print(m);
           }
        }




    }
}
