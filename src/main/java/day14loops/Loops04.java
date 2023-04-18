package day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Hesabiniz bloke olmustur" mesaji alsın.
        //3 kereye kadar yanlis girerse "Yanlis girdiniz tekrar deneyiniz" mesaji alsın.
        //Dogru girerse "Hesabiniza hosgeldiniz"mesaji alsın.

        Scanner input = new Scanner(System.in);
        int counter =0;
        String validUsername = "techpro123";
        String validPassWord = "Education12?";

        do {
            if (counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if (userName.equals(validUsername) &&passWord.equals(validPassWord)){
                System.out.println("Welcome to your accounter");
                break;
            }else {
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while (true);


    }
}
