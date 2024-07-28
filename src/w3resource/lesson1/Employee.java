package w3resource.lesson1;

import java.util.Scanner;

public class Employee {
    private String name;
    private  String lavozim;
    private int money;

    public Employee() {
    }
    public void print(){
        System.out.println("lavozimi "+getLavozim()+"\nname: "+getName()+"\nmoney "+getMoney());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLavozim() {
        return lavozim;
    }

    public void setLavozim(String lavozim) {
        this.lavozim = lavozim;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static class testEmployee {
        public static void main(String[] args) {
            Employee employee = new Employee();
            Scanner scanner=new Scanner(System.in);

            employee.setLavozim(scanner.nextLine());
            employee.setName(scanner.nextLine());
            employee.setMoney(scanner.nextInt());
            employee.print();
        }
    }
}
