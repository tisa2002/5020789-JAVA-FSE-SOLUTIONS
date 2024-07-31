public class FinancialForecasting {

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial value
        double[] growthRates = {0.05, 0.03, 0.04, 0.02}; // Growth rates for each period

        double futureValue = predictFutureValue(initialValue, growthRates, growthRates.length);
        System.out.println("Predicted future value: " + futureValue);
    }

    public static double predictFutureValue(double initialValue, double[] growthRates, int n) {
        // Base case: if no more periods, return the initial value
        if (n == 0) {
            return initialValue;
        }

        // Recursive case: calculate the future value for the previous period
        double previousValue = predictFutureValue(initialValue, growthRates, n - 1);

        // Apply the growth rate for the current period
        double growthRate = growthRates[n - 1];
        return previousValue * (1 + growthRate);
    }
}
