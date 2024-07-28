package w3resource.lesson1;

import java.util.Scanner;

public class testEmployee9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee9 employee9 = new Employee9();
        employee9.setName(scanner.nextLine());
        employee9.setMoney(scanner.nextInt());
      //  employee9.getYearsOfService()
        employee9.print();

    }
}
