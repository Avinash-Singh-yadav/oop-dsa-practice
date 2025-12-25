package Strings;

public class StringOpr {
    public static void main(String[]args){
        String name = "Avinash Yadav";

        int n = name.length();
        System.out.println("the length is: " +n);
        char first = name.charAt(2);
        System.out.println("the first char is: " + first);
        int ind = name.indexOf("n");
        System.out.println("the index is: "+ ind);
        String name2 =  name.toLowerCase();
        System.out.println("the name 2 is: "+name2);
        String name3 = name.replace("yadav", "singh");
        System.out.println("the singh replacement is: "+name3);


    }
}
