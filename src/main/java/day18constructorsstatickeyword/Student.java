package day18constructorsstatickeyword;

public class Student {
    /*
    1)"static"class member'lar(variable + method + constructor + code blocks) tum objeler tarafindan paylasilir.
    2)"static"class member'lardaki degisiklikler tum objeler tarafindan otomatik olarak gorulur.
    3)"static"class member'lar gokteki ayin dunyaya bagli oldugu gibi classa baglidirler.
    Bu yüzden static variable lara class variable da denir.
    4)"static" class memberlarin nasil calistigini anlamak icin cizim yapip static olanlari classa olmayanlari objecta
    baglayarak dusunmek bu konuyu kolaylastirir.
    5)"static"class member'lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
      "non-static"class member'lari cagirmak icin object olusturmak sarttir.



     */

    public static int numOfRegisteredStd = 0;

    public int num =0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        System.out.println(numOfRegisteredStd);//0
        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);//1
        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2
        Student s3 = new Student();

        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);//1
    }
}
