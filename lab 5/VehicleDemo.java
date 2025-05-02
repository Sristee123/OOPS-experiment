package lab_5;

public class VehicleDemo {
	public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 8);
        Motorcycle bike = new Motorcycle("Harley", "Sportster", 15000, 1200, "Cruiser");

        car.displayDetails();
        eCar.displayDetails();
        bike.displayDetails();
    }
}
