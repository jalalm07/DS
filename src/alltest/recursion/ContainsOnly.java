package alltest.recursion;

public class ContainsOnly {
    public static boolean containsOnly(int[] arr, int size, int target) {
        // Base case: if the size is 0, return true
        if (size == 0) {
            return true;
        }
        
        // Check if the last element is equal to the target value
        if (arr[size - 1] != target) {
            return false;
        }
        
        // Recursive case: check the rest of the array
        return containsOnly(arr, size - 1, target);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 5, 5, 5, 5};
        int[] arr2 = {5, 5, 5, 6, 5};
        
        System.out.println("arr1 contains only 5: " + containsOnly(arr1, arr1.length, 5));
        System.out.println("arr2 contains only 5: " + containsOnly(arr2, arr2.length, 5));
    }
}
