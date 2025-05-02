package lab_5;

public class WorkerDemo {
	  public static void main(String[] args) {
	        Worker w1 = new DailyWorker("Sristee", 19);
	        Worker w2 = new SalariedWorker("Aarushi", 19);

	        w1.computePay(5); 
	        w2.computePay(50); 
	    }
	 
}
