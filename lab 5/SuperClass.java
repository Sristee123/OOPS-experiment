package lab_5;

public class SuperClass {
	 private int privateVar = 20;

	    public int getPrivateVar() { 
	        return privateVar;
	    }
	}
	class SubClass extends SuperClass {
	    public void show() {
	        System.out.println( getPrivateVar());
	    }
}
