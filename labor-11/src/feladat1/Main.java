package feladat1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        ArrayList<MyDate> dates = new ArrayList<MyDate>();
        for (int i = 0; i < 10; i++) {
            int month = (int)(Math.random() * 12) + 1;
            int day = (int)(Math.random() * 31) + 1;
            dates.add(new MyDate(currentYear, month, day));
        }
        System.out.println("Unsorted dates: ");
        for (MyDate date : dates){
            System.out.println(date.toString());
        }
        Collections.sort(dates);
        System.out.println("\n");
        System.out.println("Sorted dates: ");
        for (MyDate date : dates){
            System.out.println(date.toString());
        }
    }
}
