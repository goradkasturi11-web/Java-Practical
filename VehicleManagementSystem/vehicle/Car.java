
package vehicle;

public class Car extends Vehicle {

    String fuelType;
    int numberOfSeats;

    public Car(String brand, String model, String fuelType, int numberOfSeats) {
        super(brand, model);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}
