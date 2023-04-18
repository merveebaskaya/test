package introduction.day36expections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E06 {
    /*
    1)FileNotFoundException ve IOException Compile Time Exception lardir yani kodu yazarken hata aliriz.
    2)FileNotFoundException path in doogrulugu ve dosyanin varligi ile ilgilidir.
      IOException tum input ve output islemleri ile ilgilidir.
    3)IOException class, FileNotFoundException class in parent i dir.
    4)Istenirse FileNotFoundException yerine IOException da kullanilabilir
    5)IOException class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException
    altta kullanilmalidir
     */
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/introduction/day36expections/file.txt");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
