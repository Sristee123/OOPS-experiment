package lab_4;

public class Course {
	 String courseName;
	    String courseCode;
	    Course(String courseName, String courseCode) {
	        this.courseName = courseName;
	        this.courseCode = courseCode;
	    }
	    void displayCourse() {
	        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
	    }
	    public static void main(String[] args) {
	        Course c1 = new Course("Java Programming", "CS101");
	        c1.displayCourse();
	    }
}
