class shape {
public static void area() {
	System.out.println("area is");
}
}
class Triangle extends shape{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
