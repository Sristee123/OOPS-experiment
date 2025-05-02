package lab_7;

abstract class Shape {
	 abstract void calculateArea();
	}
	class Rectangle extends Shape {
	    int length, width;
	    
	    Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }
	    void calculateArea() {
	        System.out.println("Rectangle Area: " + (length * width));
	    }
	}
	class Circle extends Shape {
	    double radius;
	    
	    Circle(double radius) {
	        this.radius = radius;
	    }
	    void calculateArea() {
	        System.out.println("Circle Area: " + (Math.PI * radius * radius));
	    }	
}
