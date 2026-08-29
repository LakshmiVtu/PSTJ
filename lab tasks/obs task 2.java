import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    static class SensorReading {
        String id;
        double temperature;

        SensorReading(String id, double temperature) {
            this.id = id;
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<SensorReading> readings = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String id = sc.next();
                double temperature = sc.nextDouble();
                readings.add(new SensorReading(id, temperature));
            }

            Map<String, Double> averages = readings.stream()
                    .filter(reading -> reading.temperature > 50)
                    .collect(Collectors.groupingBy(
                            reading -> reading.id,
                            Collectors.averagingDouble(reading -> reading.temperature)));

            averages.values().stream()
                    .sorted((first, second) -> Double.compare(second, first))
                    .forEach(System.out::println);
        }

        sc.close();
    }
}