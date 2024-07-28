package geeksforgeeks;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      foctorial(scanner.nextInt());
       /* int n= scanner.nextInt();
        int result=1;
        if( n==1 || n==0)
            System.out.println(1);
        for(int i=2;i<=n;i++){
            result=result*i;
        }
        System.out.println(result);*/
    }
    static int foctorial(int n){
        int result=1;
      //  if( n==1 || n==0)
          //  return 1;
        for(int i=2;i<=n;i++){
            result=result*i;
        }
       return result;

    }

}
