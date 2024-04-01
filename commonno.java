import java.util.HashSet;
import java.util.Set;

public class commonno {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        System.out.println("Common elements between the two arrays:");
        findCommonElements(array1, array2);
    }
    
    public static void findCommonElements(int[] arr1, int[] arr2) {
        // Create a HashSet to store unique elements of the first array
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        
        // Iterate through the second array and check for common elements
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
