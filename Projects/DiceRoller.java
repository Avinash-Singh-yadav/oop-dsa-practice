package Projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total =0;

        System.out.print("Enter the number of Dice:");
        numOfDice = sc.nextInt();

        if(numOfDice > 0){
            for (int i=1;i<=numOfDice;i++){
                int rolls = random.nextInt(1,7);
                printDie(rolls);
                System.out.println("you rolled: "+rolls);
                total += rolls;
            }
            System.out.println("Total: "+ total);
        }else{
            System.out.println("Number of dice must be greater than 0");
        }
        sc.close();
    }

    public static void printDie(int rolls){
        String die1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String die2 = """
                 -------
                | ●     |
                |       |
                |      ●|
                 -------
                """;

        String die3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String die4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String die5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String die6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(rolls){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.println("invalid dice rolled. Try again.");
        }
    }
}
