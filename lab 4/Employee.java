package lab_4;

public class Employee {
	 private static int totalEmployees = 0; 
	    private double salary; 
	    int empID;
	    String name;
	    String department;

	    Employee() {
	        this.empID = 0;
	        this.name = "Default Name";
	        this.department = "Not Assigned";
	        this.salary = 0.0;
	        totalEmployees++;
	    }

	    Employee(int empID, String name, String department, double salary) {
	        this.empID = empID;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	        totalEmployees++;
	    }
	    // Getter method for salary
	    public double getSalary() {
	        return salary;
	    }
	    void displayEmployeeInfo() {
	        System.out.println("ID: " + empID + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
	    }
	    static void displayTotalEmployees() {
	        System.out.println("Total Employees: " + totalEmployees);
	    }

	    public static void main(String[] args) {
	        Employee e1 = new Employee(); 
	        Employee e2 = new Employee(101, "Alice", "HR", 50000); 
	        Employee e3 = new Employee(102, "Bob", "IT", 60000);

	        e1.displayEmployeeInfo();
	        e2.displayEmployeeInfo();
	        e3.displayEmployeeInfo();

	        displayTotalEmployees();
	    }
}
