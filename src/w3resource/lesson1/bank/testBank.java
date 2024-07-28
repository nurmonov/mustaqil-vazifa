package w3resource.lesson1.bank;

import java.util.Scanner;

public class testBank {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

       Bank bank = new Bank();
       Accaunt accaunt = new Accaunt();
       System.out.println("akkauntni kiriting");
       bank.setName(scanner.nextLine());
        System.out.println("akkauntNumberni kiriting ");
        bank.setAccountNumber(scanner.nextLine());
       // bank.setBalans();
        System.out.println("1-> inMoney \n2-> onMoney");
        int m= scanner.nextInt();
        switch (m){

            case 1: System.out.println("qanca pul olmoqcisiz");
                     bank.oliw(scanner.nextInt()); break;
            case 2:
                   System.out.println("qanca pul kiritmoqcisiz");
                   bank.quwiw(scanner.nextInt());
                   break;
        }
       bank.print();
    }

}
