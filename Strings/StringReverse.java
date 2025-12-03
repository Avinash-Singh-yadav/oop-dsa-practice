package Strings;

public class StringReverse {
    public static void main(String[] args){
        String st = "java";
        char[] arr = st.toCharArray();
        int n = arr.length;


        for(int i=0 ; i<n/2;i++){
            char temp = arr[i];
            arr[i] =  arr[n-1-i];
            arr[n-1-i] = temp;
        }
        String reverse = new String(arr);
        System.out.println("the reverse of string "+st +" is: "+reverse);
    }
}
