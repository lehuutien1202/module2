package Bai2;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 ;

        }        System.out.println("Total of interest: " + totalInterest);
    }
}
