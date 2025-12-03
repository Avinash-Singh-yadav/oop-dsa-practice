package Strings;

public class CheckVowels {
    public static void main(String[] args){
        String st = "Hello, World!";
        int n = st.length();
        int count = 0;
        for(int i=0 ;i<n;i++){
           char ch = st.charAt(i);
           if("AEIOUaeiou".indexOf(ch)!= -1){
               count++;
           }
        }
        System.out.println("the number of vowels are: " +count);
    }
}
