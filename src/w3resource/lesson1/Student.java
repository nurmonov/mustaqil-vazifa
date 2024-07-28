package w3resource.lesson1;

import java.util.Scanner;

public class Student {
    private String name;
    private  String group;
    private int gred;





    public Student(String name, String group, int gred) {
        this.name = name;
        this.group = group;
        this.gred = gred;
    }

    public Student(String group) {
        this.group = group;
    }

    public int getGred() {
        return gred;
    }

    public void setGred(int gred) {
        this.gred = gred;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name+"\n"+group +"\n"+gred);
    }
}


      class testStudent{
        public static void main(String[] args) {
            Student student = new Student("G47");
            Scanner scanner = new Scanner(System.in);
            student.setGred(scanner.nextInt());
            scanner.nextLine();
            student.setName(scanner.nextLine());
           student.print();
        }
    }

