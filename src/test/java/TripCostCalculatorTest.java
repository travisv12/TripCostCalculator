import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TripCostCalculatorTest {

    @Test
    public void testCalculateTripCost() {
        double distance = 200.0;
        double fuelPrice = 1.5;
        double expectedCost = 15.0; // (200 / 100) * 5 * 1.5

        double actualCost = TripCostCalculator.calculateTripCost(distance, fuelPrice);
        assertEquals(expectedCost, actualCost, 0.01);
    }
}