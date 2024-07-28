package geeksforgeeks;

import java.util.Arrays;

public class axercise18 {
    public static void main(String[] args) {
        long[][] A= {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n=3;
        long B[][] = new long[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {

                A[i][j]=B[j][i];

            }

        }
        String str;
        System.out.println(Arrays.toString(B));
       // System.out.println(str);

    }
}
