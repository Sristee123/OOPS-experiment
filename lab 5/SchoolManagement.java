package lab_5;

public class SchoolManagement {
	 public static void main(String[] args) {
	        Person[] people = new Person[3];
	        people[0] = new Student("Sristee");
	        people[1] = new Teacher("Aarushi");
	        people[2] = new Student("Sanskriti");

	        for (Person p : people) {
	            p.performDuty(); 
	        }
	    }
}
