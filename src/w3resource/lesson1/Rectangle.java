package w3resource.lesson1;

import java.util.Scanner;

public class Rectangle {
    private int h;
    private int eni;
    private int area;
    private int peremetr;

    public Rectangle() {
    }

    public Rectangle(int h, int eni) {
        this.h = h;
        this.eni = eni;
    }
    public void print(){
        System.out.println("area: "+getArea()+"\nperemetr: "+getPeremetr());
    }

    public int getArea() {
       // int area=h*eni;
        return h*eni;
    }

    public int getPeremetr() {
       // int peremetr=h*2+eni*2;
        return h*2+eni*2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getEni() {
        return eni;
    }

    public void setEni(int eni) {
        this.eni = eni;
    }

    public static class testRectangle {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            Scanner scanner=new Scanner(System.in);

            rectangle.setH(scanner.nextInt());
            rectangle.setEni(scanner.nextInt());
            rectangle.print();

        }
    }
}
