import java.util.Scanner;

public class TripCostCalculator {
    private static final double FUEL_CONSUMPTION_RATE = 5.0; // liters per 100 km

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to travel (in kilometers): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        double totalCost = calculateTripCost(distance, fuelPrice);
        System.out.printf("The total cost of the trip is: %.2f%n", totalCost);
    }

    public static double calculateTripCost(double distance, double fuelPrice) {
        double fuelNeeded = (distance / 100) * FUEL_CONSUMPTION_RATE;
        return fuelNeeded * fuelPrice;
    }
}