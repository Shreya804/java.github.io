public class missingno {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // assuming one number is missing
        
        int missingNumber = findMissingNumber(array);
        
        System.out.println("The missing number is: " + missingNumber);
    }
    
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Expected number of elements (including the missing number)
        
        // Calculate sum of expected sequence of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number will be the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}
