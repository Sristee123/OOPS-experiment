package lab_4;

public class Student {
	String name;
    int age;
    Student() {
        this.name = "Default Name";
        this.age = 18;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student("Alice", 20);
        s1.display();
        s2.display();
    }
}

