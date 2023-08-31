package ds.pattern;

public class PrintBarChart {

    public static void main(String[] args) {
        int arr[] = {456, 250, 345};
        printBar(arr, arr.length);
    }

    private static void printBar(int[] arr, int length) {
        int num;
        for(int i=0; i<length; i++){
            num = arr[i] / 100;
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
