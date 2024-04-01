import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        
        reverseArray(originalArray);
        
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }
    
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swapping elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Moving towards the center of the array
            start++;
            end--;
        }
    }
}
