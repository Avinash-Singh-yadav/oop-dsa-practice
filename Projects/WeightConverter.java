package Projects;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double weight;
        double NewWeight;
        int choice;

        System.out.println("weight conversion programme.");
        System.out.println("Choose 1: Conversion of lbs to kgs");
        System.out.println("Choose 2: Conversion of kgs to lbs");

        System.out.println("Choose an option:");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            NewWeight = weight * 0.453592;
            System.out.println("weight in kgs: " + NewWeight);

        }else if (choice == 2){
            System.out.println("Enter the weight in kgs:");
            weight = sc.nextDouble();
            NewWeight =  weight * 2.20462;
            System.out.println("weight in lbs: "+NewWeight);
        }else{
            System.out.println("PLEASE Enter correct weight!");
        }

        sc.close();
    }
}
