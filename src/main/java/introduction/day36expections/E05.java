package introduction.day36expections;

import java.io.FileInputStream; //io==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/introduction/day36expections/file.txt");
        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }

    }
}
