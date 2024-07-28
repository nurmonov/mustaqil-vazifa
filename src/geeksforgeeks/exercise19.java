package geeksforgeeks;


import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class exercise19 {
    public static void main(String[] args) {
        int[] arrey={ 3, 9, 2, 3, 1, 7, 2, 3, 5 } ;
        int k=3;
        int n=0;
        for (int i = 0; i < arrey.length; i++) {
            if(arrey[i]!=k)
                arrey[n++]=arrey[i];

        }
        // arrey=arreylist(arrey,k);
        System.out.println("arr1.length = " + Arrays.toString(arrey));

    }

}



/*
class GFG {

    // function to remove all occurrences
    // of an element from an array
    public static int[] removeElements(int[] arr, int key)
    {
        // Move all other elements to beginning
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];

        // Create a copy of arr[]
        return Arrays.copyOf(arr, index);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}
*/
