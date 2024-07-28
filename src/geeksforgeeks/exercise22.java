package geeksforgeeks;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        String str2="";
        for (int i = str.length()-1; i >=0; i--) {
            str2=str2+str.charAt(i);

        }
        System.out.println(str2);
    }
}
