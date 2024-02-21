import java.util.Scanner;

public class ejercicio1 {
    private static final double EARTH_SECONDS_IN_YEAR = 31536000;
    private static final double EARTH_SECONDS_IN_DAY = 86400;
    private static final double EARTH_SECONDS_IN_HOUR = 3600;
    private static final double EARTH_SECONDS_IN_MINUTE = 60;

    private static final double[] PLANET_YEAR_RATIO = {0.2408467, 0.61519726, 1.0, 1.8808158, 11.862615, 29.447498, 84.016846, 164.79132};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        double seconds = scanner.nextDouble();

        double earthYears = seconds / EARTH_SECONDS_IN_YEAR;
        System.out.println("Time in Earth years: " + earthYears);

        for (int i = 0; i < PLANET_YEAR_RATIO.length; i++) {
            double planetYears = earthYears / PLANET_YEAR_RATIO[i];
            System.out.println("Time in Planet " + (i + 1) + " years: " + planetYears);
        }

        // Determine and display the maximum representable values for different data types
        System.out.println("Maximum representable values:");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE);
    }
}
