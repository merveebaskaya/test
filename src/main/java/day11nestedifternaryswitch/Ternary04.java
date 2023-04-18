package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
   /*
   Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz

    */
    /*
    1)Ternary de true ve false durumlari icin size verilen data typelar farkli ise olusturdugunuz
    container in data type ini "Object" yapın.
    2)Object Javada bir classtir.
    Object javadaki bütün classlarin "Parent" i dir. Yani babasidir,Hz. adem gibi.
    "Object" Class'in "Parent"i yokktur.
    Java da parent'i olmayan tek class "Object Class"tir.
     */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter an integer...");
       int num = input.nextInt();

      Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
       System.out.println(result);
   }
}
