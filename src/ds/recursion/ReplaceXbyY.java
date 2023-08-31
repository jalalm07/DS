package ds.recursion;

import java.util.Arrays;

public class ReplaceXbyY {
    public static void main(String[] args) {
        int[] i = {2,0,5,6,0};
        replace(i, i.length, 0, 1);
        System.out.println(Arrays.toString(i));
    }

    public static void replace(int[] arr, int size, int x , int y){
        if(size == 0)
            return;

        if(arr[size-1] == x){
            arr[size-1] = y;
        }
        replace(arr, size -1, x, y);

    }
}
