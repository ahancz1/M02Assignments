import java.util.Scanner;



// GeometricObject.java: The abstract class 
abstract class GeometricObject {
private String color = "white";
private boolean filled;
/**Default construct*/
protected GeometricObject() {
}
/**Construct a geometric object*/
protected GeometricObject(String color, boolean filled) {
this.color = color;
this.filled = filled;
}
/**Getter method for color*/
public String getColor() {
return color;
}
/**Setter method for color*/
public void setColor(String color) {
this.color = color;
}
/**Getter method for filled. Since filled is boolean,
so, the get method name is isFilled*/
public boolean isFilled() {
return filled;
}
/**Setter method for filled*/
public void setFilled(boolean filled) {
this.filled = filled;
}
/**Abstract method findArea*/
public abstract double getArea();
/**Abstract method getPerimeter*/
public abstract double getPerimeter();
}




class Triangle extends GeometricObject {

private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;


// no arg constructor, uses preset sides
public Triangle() {
}

// constructor with args
public Triangle(double side1, double side2, double side3, String color, boolean filled) {
    super(color, filled);    
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    
}

// return sides
public double getSide1() {
    return side1;
}
public double getSide2() {
    return side2;
}
public double getSide3() {
    return side3;
}

// method to compute area, overrides superclass GeometricObject
public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s -side3));
}
public double getPerimeter() {
    return side1 + side2 + side3;
}
public String toString() {
    return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;

}     
}


// test driver class
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // gets side lengths from user
        System.out.println("Enter the length of each the 3 triangle sides: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();        
        // gets color from user
        System.out.print("Enter the color of the triangle: ");
        String color = scanner.next();
        // clear the scanner before reading boolean
        scanner.nextLine();        
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = scanner.nextBoolean();        
        // creates triangle from user input
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);        
 
// output
        // Display the triangle properties
        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println(triangle.toString());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
   
        scanner.close();        
    }
}