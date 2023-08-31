package ds.recursion;

public class FindMinimum {

    public static void main(String[] args) {

    }

    // {11,5,2,4,3}   size = 5
    public int minimum(int[] arr, int size){
       if(size == 1)
           return arr[size - 1];
       return Math.min(arr[size - 1], minimum(arr, size - 1));
    }


}
