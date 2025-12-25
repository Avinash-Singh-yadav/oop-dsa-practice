package Strings;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0 , email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+ 1);
            System.out.println("the userName is: " + username);
            System.out.println("the domain is: "+ domain);
        }else{
            System.out.println("Invalid username.DOESN'T contain @");
        }
        scanner.close();
    }
}
