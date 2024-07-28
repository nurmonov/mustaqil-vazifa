package geeksforgeeks;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String str= scanner1.nextLine();
        str=str.toLowerCase();
       //  boolean A=palindrome(str);
        System.out.println("palindrome() = " + palindrome(str));
    }
    public static boolean palindrome(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--) {
            str1 = str1 + str.charAt(i);
        }
        if(str.equals(str1))
            return true;
        else
            return false;
    }
}
