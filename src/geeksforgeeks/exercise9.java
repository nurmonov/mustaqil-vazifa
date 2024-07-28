package geeksforgeeks;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
      //  System.out.println("fibonacci(n) = " + fibonacci(n));
        System.out.println("fibonacciN() = " + fibonacciN(n));
    }


  /*  public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else if(n>0)
            return fibonacci(2*n-1)+fibonacci(2*n-2);
        else return 0;
    }*/
    public static int fibonacciN(int N){
        if (N <= 0)
            return 0;

        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;

        // Initializing the sum
        int s = 0;

        // Adding remaining numbers
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];

            // Only considering even indexes
            if (j % 2 == 0)
                s += fib[j];
        }

        return s;
        }
    }

