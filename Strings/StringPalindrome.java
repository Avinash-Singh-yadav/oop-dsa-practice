package Strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string to check palindrome: ");
         String st = sc.next();
         System.out.println("String "+st+" given is palindrome: " +isPalindrome(st));

    }
    public static boolean isPalindrome(String st){
        String cleaned = st.replaceAll("a-zA-Z0-9", " ").toLowerCase();
        int left = 0;
        int right = cleaned.length()-1;
        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
