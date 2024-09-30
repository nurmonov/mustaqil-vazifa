package Mashq2;



import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2020,1,1);
        LocalDate localDate1=LocalDate.of(2024,9,8);
        int workDays=0;
        int sundayDays=0;
        while (localDate1.isAfter(localDate)){
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            if (dayOfWeek.getValue()!=6&&dayOfWeek.getValue()!=7){
                workDays++;
            }
            if(dayOfWeek.getValue()==6)
                sundayDays++;
            localDate = localDate.plusDays(1);
        }



        int workdaysHours=sundayDays*4+workDays*8;
        System.out.println("workdaysHours = " + workdaysHours);
    }
}
