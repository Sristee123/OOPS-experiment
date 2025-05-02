package lab_5;

public class Vehicle {
	String brand, model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

// Derived class
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    int chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hrs");
    }
}
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}

