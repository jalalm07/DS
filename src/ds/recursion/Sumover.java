package ds.recursion;

public class Sumover {

    public static void main(String[] args) {
        double res = sum(0);
        System.out.println(res);
    }

    public static double sum(int n){
        //float sum = 0;
        if (n==0)
            return 0;
        else return (double) 1 /n + sum(n-1);
    }
}
