package day28interface;
   /*
   1)Child      Parent
     Class --> Class : extends
     interface --> interface : extends
     Class --> interface : implements
     interface --> interface : olamaz...
     Ayni ise "extends", farkli ise "implements" kullan.
     "interface"i Class'in child'i yapma.
         abstract Class ile interface arasindaki farklar nelerdir?
     *1)Abstrac Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
        Ama interface'lerde istersek "default" ve "static" keywoed'lerini kullanarak "concrete" method uretebiliriz.
     *2)Abstrac Class'lar multiple inheritance'i desteklemezler ama interface'ler destekler.
     *3)Abstrac Class'lar icinde her turlu variable olusturabilir, interface'ler icindeki variable'lara oublic, static ve final olmak zorundadir.
     4)"interface" Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
     5)abstract class'larda constructor vardir ama object uretemezler, interface'lerde constructor yoktur bu yuzden object uretilemez.
    */
public interface Mammal extends Animal{

   String feedBaby = "Milk";
   int age = 6;


}
