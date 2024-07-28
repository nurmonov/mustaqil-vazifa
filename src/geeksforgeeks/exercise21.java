package geeksforgeeks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exercise21 {

    public static void main(String[] args) {
     // count();
         int count=0;
        String x="Sileant";
        String y="Listean";
       String str= x.toLowerCase();
       String str2=y.toLowerCase();
        char[] strl=new char[str.length()];
        char[] str2l=new char[str2.length()];
        for (int i = 0; i < str.length(); i++) {
            strl[i]=str.charAt(i);

        }
        for (int i = 0; i < str2.length(); i++) {
            str2l[i]=str2.charAt(i);

        }

        Arrays.sort(str2l);
        Arrays.sort(strl);
        System.out.println("str2l = " + Arrays.toString(str2l));
        System.out.println("strl = " + Arrays.toString(strl));
       // selectionSort(strl,str2l);
        if(strl.length==str2l.length){
            for (int i = 0; i < strl.length; i++) {
                strl[i]=str2l[i];

               count++;


            }
            if(count==str.length())
                System.out.println(true);
            else
                System.out.println(false);
        }

        else
            System.out.println(false);


    }

}
