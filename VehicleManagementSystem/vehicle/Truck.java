
package vehicle;

public class Truck extends Vehicle {

    int loadCapacity;
    int numberOfWheels;

    public Truck(String brand, String model, int loadCapacity, int numberOfWheels) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
