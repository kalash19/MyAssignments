package Generics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomHashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<Integer, Double> hashMap = new HashMap<>();

        // Generate and store 10 random int keys and double values
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt();
            double value = random.nextDouble();
            hashMap.put(key, value);
        }

        // Print the contents of the HashMap
        for (Map.Entry<Integer, Double> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}