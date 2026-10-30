
import java.util.Scanner;

// Interface
interface ElectricityBill {
    double calculateBill();
}

// Custom Exception
class InvalidUnitException extends Exception {
    public InvalidUnitException(String message) {
        super(message);
    }
}

// Domestic Customer Class
class DomesticCustomer implements ElectricityBill {
    private int units;

    DomesticCustomer(int units) throws InvalidUnitException {
        if (units < 0) {
            throw new InvalidUnitException("Units cannot be negative");
        }
        this.units = units;
    }

    public double calculateBill() {
        return units * 3.0;
    }
}

// Commercial Customer Class
class CommercialCustomer implements ElectricityBill {
    private int units;

    CommercialCustomer(int units) throws InvalidUnitException {
        if (units < 0) {
            throw new InvalidUnitException("Units cannot be negative");
        }
        this.units = units;
    }

    public double calculateBill() {
        return units * 6.0;
    }
}

// Main Class
public class ElectricityBillGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter units for Domestic Customer:");
            int domesticUnit = sc.nextInt();

            System.out.println("Enter units for Commercial Customer:");
            int commercialUnit = sc.nextInt();

            // Creating objects
            ElectricityBill domestic =
                new DomesticCustomer(domesticUnit);

            ElectricityBill commercial =
                new CommercialCustomer(commercialUnit);

            // Displaying bills
            System.out.println("Domestic Bill: Rs. "
                + domestic.calculateBill());

            System.out.println("Commercial Bill: Rs. "
                + commercial.calculateBill());

        }
        catch (InvalidUnitException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
