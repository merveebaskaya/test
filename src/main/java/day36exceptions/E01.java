package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
    1)Run Button'uma bastiktan sonra console'da alinan exception'lara "Runtime Exception" denir.
      Arithmetic Exception, NullPointerException, NumberFormatException,ArrayIndexOutOfBoundsException,
      StringIndexOfBoundsException "Runtime Exception" a ornektir.
      "Runtime Exception" lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alti cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
      FileNotFoundException, IOException "Compile Time Exception" a ornektir.
      "Compile Time Exception" lara "Checked Exception" da denir.

    3)FileNotFoundException:Java'ya bir dosyayi bul dedigimizdei Java "dosyanin adresi" ve "dosyanin varligi konusunda"
      hata olusursa ne yapmasi gerektigini soylemenizi ister.

    4)IOException:"IO" Input Ouyput demektir.
                 Note: IOException, FileNotFoundException'in parent'idir.

    5)Java da hata'lar temelde 2 ye ayrilir.
      i)Exception'lar
      ii)Error'lar
         a)StackOverFlow Error(Stack Memory'nin dolmasi halinde olusur)
         b)Out Of Memory Error(Heap Memory"nin dolmasi halinde olusur)
         c)Virtual Machine Error(Java icindeki sanal makina arizasi)
     */

    public static void main(String[] args) throws IOException {

        //1.Way: Exception'i method signature satirina ekledik.
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!=-1){

            System.out.print((char)i);

        }



    }
}
