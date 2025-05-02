
public class ShapeArea {
	//rectangle (length* breath)
	 public int calculateRArea(int length, int breadth) {
	        return length * breadth;
	    }
	    //square (side * side)
	    public int calculateSArea(int side) {
	        return side * side;
	    }
	    //circle (π * r^2)
	    public float calculateCArea(float radius) {
	        return (float)(Math.PI * radius * radius); // Using float for circle area
	    }

	    //triangle (0.5 * base * height)
	    public float calculateTArea(int base, int height) {
	        return (float)(0.5 * base * height); // Using float for triangle area
	    }
	    public static void main(String[] args) {
	        ShapeArea shape = new ShapeArea();
	        System.out.println("Area of Rectangle: " + shape.calculateRArea(10, 5));
	        System.out.println("Area of Square: " + shape.calculateSArea(4));
	        System.out.println("Area of Circle: " + shape.calculateCArea(7.0f));
	        System.out.println("Area of Triangle: " + shape.calculateTArea(6, 8));
	    }
}
