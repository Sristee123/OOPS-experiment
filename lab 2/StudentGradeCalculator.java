
public class StudentGradeCalculator {

	public static void main(String[] args) {
		  int subject1 = 85;
	        int subject2 = 90; 
	        int subject3 = 78; 

	        int average = (subject1 + subject2 + subject3) / 3;

	        String grade;
	        if (average >= 90) {
	            grade = "Grade A";
	        } else if (average >= 75) {
	            grade = "Grade B";
	        } else if (average >= 50) {
	            grade = "Grade C";
	        } else {
	            grade = "Grade F";
	        }

	        System.out.println("Average Marks: " + average);
	        System.out.println("Final Grade: " + grade);

	}

}
