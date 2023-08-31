package ds.array;

public class ValidateNumArr {

    public static boolean validate(int[] arr, int size){
        for(int i=0;i<size;i++){
            if (arr[i] < 0 || arr[i] >100) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int size = 5;
        int[] arr = {1,2,3,4,5};
        System.out.println(ValidateNumArr.validate(arr,size));

    }
}
