
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class CircleClass {
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the radius of a circle: ");
    double radius = keyboard.nextDouble();

    keyboard.close();

    CircleClass circleClass = new CircleClass();
    Circle circle = circleClass.new Circle(radius);

    System.out.println("Area is " + circle.getArea());
    System.out.println("Diameter is " + circle.getDiameter());
    System.out.println("Circumference is " + circle.getCircumference());

}
}