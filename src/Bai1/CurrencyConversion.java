package Bai1;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
