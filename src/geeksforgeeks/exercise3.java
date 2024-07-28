package geeksforgeeks;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        swap(n ,m);
    }
    public static int swap(int n,int m){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("m = " + m+
                "n  = "+n);
return temp;
    }
}
