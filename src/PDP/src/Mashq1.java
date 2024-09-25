package lesson9;

public class Mashq1 {
   class Student{
       private String name;
       private String hobbies;
       private int age;

       public Student(String name, String hobbies, int age) {
           this.name = name;
           this.hobbies = hobbies;
           this.age = age;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getHobbies() {
           return hobbies;
       }

       public void setHobbies(String hobbies) {
           this.hobbies = hobbies;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }
   }

}
