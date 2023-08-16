package array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {6,8,6,8,1, 1, 2, 2, 7, 3, 4, 5};
        System.out.println(Arrays.toString(removeDups(arr)));
    }

    public static int[] removeDups(int[] arr){

        //   TODO
        int n = arr.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);

    }
}
