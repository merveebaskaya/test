package day18constructorsstatickeyword;

import java.lang.reflect.Array;

public class StudentRunner {
    public static void main(String[] args) {
        //Static olan "numOfRegistedStd" variable ini cagirmak icin sadece class ismini kullandik, objeck olusturmadik.

        System.out.println(Student.numOfRegisteredStd);
        //static olmayan "num" variable ini cagirmak icin object olusturduk.
        Student s1 = new Student();

        System.out.println(s1.num);

        //static olmayan "num" variable ina object uzerinden ulasabilirsiniz ama bu hatadir.
        System.out.println(s1.numOfRegisteredStd);




    }
}
