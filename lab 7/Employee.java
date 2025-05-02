package lab_7;
abstract class Employee {
	
	 String name;
	 String role;
	    Employee(String name, String role) {
	        this.name = name;
	        this.role = role;
	    }
	    abstract void calculateSalary();
	    abstract void displayDetails();
	}
	class Manager extends Employee {
	    double fixedSalary;
	    Manager(String name, double fixedSalary) {
	        super(name, "Manager");
	        this.fixedSalary = fixedSalary;
	    }
	    void calculateSalary() {
	        System.out.println("Manager Salary: " + fixedSalary);
	    }
	    void displayDetails() {
	        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + fixedSalary);
	    }
	}
	class Developer extends Employee {
	    double hourlyRate;
	    int hoursWorked;
	    
	    Developer(String name, double hourlyRate, int hoursWorked) {
	        super(name, "Developer");
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	    }
	    void calculateSalary() {
	        System.out.println("Developer Salary: " + (hourlyRate * hoursWorked));
	    }
	    void displayDetails() {
	        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + (hourlyRate * hoursWorked));
	    }
}
