package day18constructorsstatickeyword;

public class MethodOverLoading {

    /*
    1)Bir method ayni isim ve parametrelerle olusturulursa buna method over loading denir.
    2)"Method Overloading" Java da "iyi organizasyon"icindir.
    3)"Method Overloading" yaparken parametre 3 sekilde degistirilrbilir;
      i)Parametrelerin sayilari degistirilebilir.
      ii)Parametrelerin data typelarini degistirebilirsiniz
      iii)Parametrelerin data typelari farkli ise degistirilebilir.,,
    4)"Method Overloading" bir class'in icinde olusur bu yuzden "private" methodlarda overkoal edilebili
      "Method Overloading" butun access modifier!larda kullanılabilir.
    5)"static" methodlar overload edilebilirler.
     */


    public static void main(String[] args) {
        System.out.println(add(3, 5));

    }
    private  static  int add(int a, int b){

        return a+b;
    }
    private  static  int add(int a, int b, int c){

        return a+b+c;
    }
    private  static  double add(double a, int b){
        return a+b;
    }
    private  static  double add(int a, double b){
        return a+b;
    }


}
