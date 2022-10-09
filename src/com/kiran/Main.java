package com.kiran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// guess the number
        Scanner sc = new Scanner(System.in);
        int guessNo = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess the number in between 1 to 100:");
            userNumber  = sc.nextInt();
            if ( userNumber == guessNo){
                System.out.println(" WOW....... Your guess is absolutly correct:");
                break;
            }
            else if ( userNumber > guessNo){
                System.out.println(" Your guessing number is too large ");
            }
            else{
                System.out.println(" Your guessing number is too small ");
            }

        } while(userNumber >= 0);
        System.out.println("  The Guess number is : " );
        System.out.println(guessNo);
    }
}
