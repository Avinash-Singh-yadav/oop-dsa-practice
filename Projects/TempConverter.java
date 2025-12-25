package Projects;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        if(unit.equals("C")){
            newTemp = (temp - 32)* 5/9;
            System.out.println("Temperature in Celsius: " +newTemp);
        }else if(unit.equals("F")){
            newTemp = (temp * 5/9) + 32;
            System.out.println("Temperature In Fahrenheit: " +newTemp);
        }else{
            System.out.println("NOT A Valid Scale.");
        }
        sc.close();
    }
}
