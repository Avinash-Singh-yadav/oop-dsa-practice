package Projects;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int RandomNum;
        int guess=0;
        int count=0;

        System.out.println("WElCOME To Guessing Game:");
        RandomNum = random.nextInt(1,101);
        while(RandomNum != guess) {
            System.out.println("Enter a guess between 1 to 100: ");
            guess = sc.nextInt();
            if(guess <=100) {
                if (guess == RandomNum) {
                    System.out.println("Right ACCEPTED!");
                } else if (guess < RandomNum) {
                    System.out.println("Wrong! Number Is Greater Than " + guess +" Try Again");
                } else {
                    System.out.println("Wrong! Number Is Smaller Than " + guess +" Try Again");
                }
            }else{
                System.out.println("Number must be Between (1-100) :");
            }
            count++;
        }
        System.out.println("GREAT! You have DONE In "+count + " Attempts");
        sc.close();
    }
}
