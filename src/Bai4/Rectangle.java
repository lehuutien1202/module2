package Bai4;

import java.util.Scanner;

public class Rectangle {
    double width, heigth;

    public Rectangle() {
    }

    public Rectangle(double width, double heigth){
        this.width = width;
        this.heigth = heigth;
    }
    public double getArea() {
        return this.width * this.heigth;
    }

    public double getPerimeter() {
        return (this.width + this.heigth) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + heigth + "}" ;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}


