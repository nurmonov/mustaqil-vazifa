package Mashq1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

   private int balance;
   private final Lock lock=new ReentrantLock();

    public void increaseBalance(){
        try {
            lock.lock();
            this.balance+=1;
        }finally {
            lock.unlock();
        }

    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < 10000; i++) {
            bank.increaseBalance();
        }
    }

}
