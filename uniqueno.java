import java.util.HashMap;
import java.util.Map;

public class uniqueno {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 5};
        
        System.out.println("Unique numbers in the array:");
        printUniqueNumbers(array);
    }
    
    public static void printUniqueNumbers(int[] arr) {
        // Create a HashMap to store the count of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each number in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Print numbers with count = 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
