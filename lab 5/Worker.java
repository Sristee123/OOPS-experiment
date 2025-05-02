package lab_5;
public class Worker {
	 String name;
	    double salaryRate;
	    public Worker(String name, double salaryRate) {
	        this.name = name;
	        this.salaryRate = salaryRate;
	    }
	    public void computePay(int hours) {
	        System.out.println("Worker: " + name + " earns " + (salaryRate * hours));
	    }
	}
	class DailyWorker extends Worker {
	    public DailyWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }
	    public void computePay(int days) {
	        System.out.println("Daily Worker: " + name + " earns " + (salaryRate * days * 8));
	    }
	}
	class SalariedWorker extends Worker {
	    public SalariedWorker(String name, double salaryRate) {
	        super(name, salaryRate);
	    }
	    public void computePay(int hours) {
	        System.out.println("Salaried Worker: " + name + " earns " + (salaryRate * 40));
	    }
}
