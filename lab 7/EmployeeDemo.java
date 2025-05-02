package lab_7;

public class EmployeeDemo {
	 public static void main(String[] args) {
	        Employee manager = new Manager("Alice", 5000);
	        Employee developer = new Developer("Bob", 50, 160);
	        
	        manager.displayDetails();
	        manager.calculateSalary();
	        developer.displayDetails();
	        developer.calculateSalary();
	    }
}
