package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

       //primitive      :char    - boolean-byte-short- int-  long-float-double
        // wrapper class:Charecter-Boolean-Byte-Short-Integer-Long-Float-Double

     //Wrapper Class'lar non-primitive'dir.o yüzden memoryde cok yer kaplarlar.
     //o yüzden sart degilse wrapper class tercih etmeyiz
     //böyle bir imkanın varlıgından da haberdar olmaliyiz.

    //n yazip "." koyarsanız hiç method goremezsiniz.cunku primitiveler method icermez.

     int n = 12;
     //m yazip nokta koyarsaniz birçok method görebilirsiniz,cünkü wrapper classlar method icerir.
     Integer m = 12;

     byte p =13;
     Byte r =13;

     //ornek:1 short data typenin minimum ve maximum degerlerini kod yazarak bulunuz.
     short maxShort = Short.MAX_VALUE;
     System.out.println(maxShort);

     Short minShort = Short.MIN_VALUE;
     System.out.println(minShort);

     //ornek2: int data typeının minimum degeri ile byte data typeinin max degerlerinin toplamını bulunuz.

     int intMin = Integer.MIN_VALUE;
     byte byteMax = Byte.MAX_VALUE;

     System.out.println(intMin+byteMax); //-2147483521

        //ornek3: i)primitive int'i wrapper INTEGER'a ceviriniz.
     int num =13;
     Integer wrapperNum = num;
      //primitive yani method bulunmayan bir kutudaki degeri alarak icinde
        // bazi methodlar bulunan wrapper kutuya atama yaparsak bu isleme
        //autoboxing denir

     //ii)wrapper byte i primitive byte a ceviriniz.
    Byte k = 33;
    byte primitiveK = k;

    //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
    // primitive yani method bulunmayan atama yaparsak bu isleme
    //unboxing denir.

    //ornek4:i)primitive chari wrapper Charaktere ceviriniz.(autoboxing)
    char initial = 'T';
    Character initialWrapper = initial;

    //ii)wrapper boolean i primitive booleana ceviriniz.(unboxing)
    Boolean isOld = true;
    boolean isOldpr = isOld;













    }
}
