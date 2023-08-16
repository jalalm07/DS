package txstate.test;

public class ValidateArray {

    public static void main(String[] args) {
        int arr[] = {1,22,44,22,111,55,87,1};
        System.out.println(validate(arr,arr.length));;
    }

    private static boolean validate(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if(arr[i] < 0 || arr[i] > 100)
                return false;
        }
        return true;
    }
}
