package TH_OOP_Rectangle;

import java.util.Scanner;

public class Rectangle {
    double width, height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chiều Rông Rectangle");
        double width = scanner.nextDouble();
        System.out.println("Nhập Chiều Cao Rectangle");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }

    //Định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
