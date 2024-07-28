package w3resource.lesson1;

import java.util.Scanner;

public class Circle {
    private int R;
    private int area;
    private int uzunlik;


    public Circle() {
    }

    public void print(){
        System.out.println("area: "+getArea()+"\nuzunlik: "+getUzunlik());

    }

    public int getArea() {
        return (int) (Math.PI*R*R);
    }

    public int getUzunlik() {
        return  (int) Math.PI*2*R;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public static class testCercle {
        public static void main(String[] args) {
            Circle circle = new Circle();
            Scanner scanner=new Scanner(System.in);

            circle.setR(scanner.nextInt());
            circle.print();
        }
    }
}
