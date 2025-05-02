package Q;
import p.A;
public class B extends A {
	
	
	 protected void protectedMethod() {
	        System.out.println("Protected Method");
	    }
	public static void main(String[] args) {
        A obj = new A();
        obj.publicMethod(); 
        obj.accessPrivateMethod();
        B objB = new B();
        objB.protectedMethod(); 
       
    }
}
