package w3resource.lesson1;

import java.util.Scanner;

public class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public TrafficLight() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print(){
        System.out.println("color = " + color);
    }

    public static class testTrafficLight {
        public static void main(String[] args) {
            TrafficLight trafficLight = new TrafficLight();
            Scanner scanner=new Scanner(System.in);
            trafficLight.setColor(scanner.nextLine());
            if(trafficLight.getColor().equals("red"))
                System.out.println("red");
            else if(trafficLight.getColor().equals("green"))
                System.out.println("green");
            else
                System.out.println("error");

        }
    }
}
