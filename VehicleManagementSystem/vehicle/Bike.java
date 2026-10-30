
package vehicle;

public class Bike extends Vehicle {

    int engineCapacity;
    double mileage;

    public Bike(String brand, String model, int engineCapacity, double mileage) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}
