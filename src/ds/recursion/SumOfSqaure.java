package ds.recursion;

public class SumOfSqaure {
    public static void main(String[] args) {
        int result = sumSq(3);
        System.out.println(result);
    }

    private static int sumSq(int n) {
        if(n == 0) return 0;
        else {
         return n*n + sumSq(n-1);
        }
    }
}
