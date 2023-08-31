package ds.recursion;

public class CountOcc {

    public static int countV(int a[], int size, int v){
        if(size == 0)
            return 0;

        if(a[size-1] == v)
            return 1 + countV(a,size-1,v);
        else return countV(a, size-1, v);
    }

    public static void main(String[] args) {
        int[] arr = {9,7,3,4,7,1};

        System.out.println(countV(arr, arr.length, 7));
    }
}
