package w3resource.lesson1;

import java.util.Scanner;

public class Examp1 {
     String name;
     int age;

    public Examp1() {
    }

    public Examp1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("name: "+this.name+" ege: "+this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class testExampl1 {
        public static void main(String[] args) {
            Examp1 examp= new Examp1();

            Scanner scanner=new Scanner(System.in);


            System.out.println("what is name:");
            examp.setName(scanner.nextLine());
            System.out.println("how old are you: ");
            examp.setAge(scanner.nextInt());
            examp.print();


           /* examp.name= scanner.nextLine();
           // scanner.nextLine();
            examp.age= scanner.nextInt();

            examp.print();*/


        }
    }
}
