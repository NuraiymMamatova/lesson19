package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);
     String  day = scanner.nextLine();
     DaysOfTheWeek.daysOfTheWeek(DaysOfTheWeek.valueOf(day.toUpperCase()));
    }
}
