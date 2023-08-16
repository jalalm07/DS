package alltest.recursion;

public class CountOccurrences {
    public static int countV(int[] arr, int size, int v) {
        // Base case: if the size is 0, return 0 (no occurrences)
        if (size == 0) {
            return 0;
        }
        
        // Recursive case: check if the last element is equal to v
        int count = (arr[size - 1] == v) ? 1 : 0;
        
        // Make a recursive call with the rest of the array (excluding the last element)
        return count + countV(arr, size - 1, v);
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 3, 4, 7, 1};
        int target = 7;
        
        int occurrences = countV(arr, arr.length, target);
        System.out.println("Number of occurrences of " + target + ": " + occurrences);
    }
}
