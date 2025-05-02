package p;

public class A {
	public void publicMethod() {
        System.out.println("Public Method");
    }

   
    private void privateMethod() {
        System.out.println("Private Method");
    }
    public void accessPrivateMethod() {
        privateMethod();
    }
}
