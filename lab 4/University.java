package lab_4;

public class University {
	static String universityName = "ABC University"; 
    String studentName; 
    University(String studentName) {
        this.studentName = studentName;
    }
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args) {
        displayUniversityName();
        University s1 = new University("Sristee");
        University s2 = new University("Aarushi");
        s1.displayStudent();
        s2.displayStudent();
    }
}
