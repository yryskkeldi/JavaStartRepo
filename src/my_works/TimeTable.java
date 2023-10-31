package my_works;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner schedule = new Scanner(System.in);
        System.out.print("Enter time: ");

        double time = schedule.nextDouble();
        if (time < 8.00) {
            System.err.println("Empty");
        }
        else if (time >= 8.00 && time < 10.00) {
            System.out.println("Breakfast");
        }
        else if (time >= 10.00 && time < 12.00) {
            System.out.println("Branch");
        }
        else if (time >= 12.00 && time < 14.00) {
            System.out.println("Lunch");
        }
        else if (time >= 17.00 && time <= 20.00) {
            System.out.println("Dinner");
        }
        else {
            System.err.println("Empty");
        }

    }
}