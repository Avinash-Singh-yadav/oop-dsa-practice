package Projects;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        //compound interest calculator

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        int n;
        int time;
        double amount;

        System.out.println("Enter the principal: ");
        principal = input.nextDouble();

        System.out.println("Enter the rate of interest: ");
        rate = input.nextDouble()/100;

        System.out.println("Enter the time of compounding: ");
        n = input.nextInt();

        System.out.println("Enter time of compounding: ");
        time = input.nextInt();
        int times = n*time;

        amount = principal* Math.pow(1+rate/n,times);
        System.out.println("The amount after %d years is $%.2f"+time + amount);

    input.close();
    }
}
