package alltest.array;

public class TwoSum {

    public static boolean hasTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
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
