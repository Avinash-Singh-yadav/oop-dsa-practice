package Strings;

import java.util.Scanner;

public class WordsChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String st = sc.nextLine();

        System.out.println("Number of words: " + numberOfWords(st));
        System.out.println("Largest word: " + largestWord(st));
    }

    // Count number of words
    public static int numberOfWords(String st){
        int count = 0;
        boolean inword = false;

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);

            if(Character.isWhitespace(ch)){
                inword = false;
            } else {
                if(!inword){
                    count++;
                    inword = true;
                }
            }
        }
        return count;
    }

    // Find the largest word
    public static String largestWord(String st){
        String[] words = st.split("\\s+"); // split by spaces
        String largest = "";

        for(String w : words){
            if(w.length() > largest.length()){
                largest = w;
            }
        }
        return largest;
    }
}
