package day14loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {

        int i = 1;

        while(i<1){// while loop'da body'sinin hiç çalismamasi mumkundur.(Zero excecution is possible.)
            System.out.println("while loop");
            i++;
        }

        //do-while-loop
        int k=1;

        do {
            System.out.println("do-while-loop");
            k++;
        }while(k<1);

        System.out.println();

        //Kullanici bir sayi girsin,sayi 100den kucuk ise kullanici "Kazandiniz" mesaji alsin.
        //diger durumlarda "Kaybettiniz" mesaji alsın.
        Scanner input = new Scanner(System.in);



        do {//do-while-loop'ta loop bodysi en az bir kez ?

            System.out.println("Please enter an integer"); //Baslangıc degeri oldu.
            int n = input.nextInt();

            if (n<100){
                System.out.println("Won!");
            }else {
                System.out.println("Lost!");
                break;
            }
        }while (true);


        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.
        do{

            System.out.println("Please enter a word");
            String s = input.next();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
                break;
            }

        }while(true);




    }
}
