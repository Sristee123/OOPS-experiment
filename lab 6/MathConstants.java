package lab_6;

public class MathConstants {
	final double PI = 3.14159;
    final void displayPI() {
        System.out.println("The value of PI is: " + PI);
    }
}
class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius; 
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}

