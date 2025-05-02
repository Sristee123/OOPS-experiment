package lab_7;

public class ShapeDemo {
	public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        rectangle.calculateArea();
        circle.calculateArea();
    }
}
