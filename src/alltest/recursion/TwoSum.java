package alltest.recursion;

public class TwoSum {

    public static boolean hasTwoSumRecursive(int[] nums, int target, int startIndex) {
        if (startIndex >= nums.length) {
            return false; // Base case: end of array reached
        }

        for (int i = startIndex + 1; i < nums.length; i++) {
            if (nums[startIndex] + nums[i] == target) {
                return true; // Found a pair that sums up to the target
            }
        }

        return hasTwoSumRecursive(nums, target, startIndex + 1); // Move to the next element
    }

    public static boolean hasTwoSum(int[] nums, int target) {

        return hasTwoSumRecursive(nums, target, 0);

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        boolean hasSum = hasTwoSum(nums, target);

        if (hasSum) {
            System.out.println("There are two numbers that sum up to the target.");
        } else {
            System.out.println("No two numbers sum up to the target.");
        }
    }
}
