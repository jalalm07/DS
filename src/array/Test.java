package array;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,1};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }


}
