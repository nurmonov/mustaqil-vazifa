package geeksforgeeks;

import java.util.Arrays;

public class axercise17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = new int[arr.length];
        int n = 2;
        for (int i = n; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] = arr1[j];

            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = arr.length - n; j < arr.length; j++) {
                    arr[i] = arr1[j];

                }

            }
        System.out.println(Arrays.toString(arr1));
        }

}
