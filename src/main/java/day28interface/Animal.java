package day28interface;

public interface Animal {

    void eat(); // Bu method abstract ve public.
    void drink();
    //1)interface'lerdeki tum variable'lar otomatik olarak "final"dir.
    //  Bu yuzden interface icindeki variable'i olusturdugunuzda deger atamasi yapmalisiniz.
    //  Bilindigi gibi final variable'larin degerleri degistirilemez.
    //2)interface'lerdeki tum variable'lar otomatik(default==varsayılır) olarak "public"dir.
    //3)interface'lerdeki tum variable'lar otomatik(default) olarak "static"dir.//static olmazsa ona ulasmak icin obje olusturmalıyız ama olusturulmaz mecburen static.
    int age =4;

}
