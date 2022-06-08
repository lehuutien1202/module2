package Bai1;

import java.time.Year;
import java.util.Scanner;

public class Day_Of_Month {
    public static void main(String[] args) {
        int month, year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days?: ");
        month = scanner.nextInt();
        System.out.println("Which year that you want to count days?: ");
        year = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '" + month + "'has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month '" + month + "'has 30 days!");
                break;
            case 2:
                if((year % 4 == 0 & year % 100 !=0) || (year %400==0)) {
                    System.out.println("The month '2' has 29 days!");
                }else {
                    System.out.println("The month '2' has 28 days!");
                }
                break;
            default:
                System.out.println("wrong data input ");
                break;
        }
    }
}
