package geeksforgeeks;

public class exercise15 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,0,7,56,4,2};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println(max);
    }
}
