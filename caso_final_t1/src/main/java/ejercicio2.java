import java.util.ArrayList;
import java.util.List;

class ResourceConsumptionCalculator {
    private List<Integer> resourceConsumption;

    public ResourceConsumptionCalculator() {
        resourceConsumption = new ArrayList<>();
    }

    public void addResourceConsumption(int consumption) {
        resourceConsumption.add(consumption);
    }

    public double calculateAverage() {
        int sum = 0;
        for (int consumption : resourceConsumption) {
            sum += consumption;
        }
        return (double) sum / resourceConsumption.size();
    }

    public int calculateMinimum() {
        int min = Integer.MAX_VALUE;
        for (int consumption : resourceConsumption) {
            if (consumption < min) {
                min = consumption;
            }
        }
        return min;
    }

    public int calculateMaximum() {
        int max = Integer.MIN_VALUE;
        for (int consumption : resourceConsumption) {
            if (consumption > max) {
                max = consumption;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ResourceConsumptionCalculator calculator = new ResourceConsumptionCalculator();

        // Add resource consumption values
        calculator.addResourceConsumption(10);
        calculator.addResourceConsumption(15);
        calculator.addResourceConsumption(20);

        // Calculate and display results
        double average = calculator.calculateAverage();
        int minimum = calculator.calculateMinimum();
        int maximum = calculator.calculateMaximum();

        System.out.println("Average consumption: " + average);
        System.out.println("Minimum consumption: " + minimum);
        System.out.println("Maximum consumption: " + maximum);
    }
}