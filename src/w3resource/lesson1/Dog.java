package w3resource.lesson1;

import java.util.Scanner;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {
    }
    public void print(){
        System.out.println("name :"+this.name+"\nbreed: "+this.breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static class testDog {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Scanner scanner=new Scanner(System.in);


            dog.setName(scanner.nextLine());
            dog.setBreed(scanner.nextLine());
            dog.print();
        }
    }
}
