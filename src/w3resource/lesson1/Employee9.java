package w3resource.lesson1;
import java.time.LocalDate;
import java.time.Period;


public class Employee9 {
    private String name;
    private LocalDate  workDay;
    private int money;

    public Employee9() {
    }

    public Employee9(String name, LocalDate workDay, int money) {
        this.name = name;
        this.workDay = workDay;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getWorkDay() {
        return workDay;
    }

    public void setWorkDay(LocalDate workDay) {
        this.workDay = workDay;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getYearsOfService() {

        return Period.between(workDay, LocalDate.now()).getYears();
    }
    public void print(){
        System.out.println("Name: "+this.name+"\nworkDay: "+this.workDay+"\nmoney: "+this.money);
    }
}
