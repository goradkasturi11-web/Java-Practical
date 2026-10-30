
package main;

import vehicle.*;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Tata", "Nexon", "Petrol", 5);

        vehicles[1] = new Bike("Honda", "Shine", 125, 55.5);

        vehicles[2] = new Truck("Tata", "Signa", 15, 10);

        System.out.println("===== VEHICLE MANAGEMENT SYSTEM =====");

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("----------------------------");
        }
    }
}
