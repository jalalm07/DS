package array;

public class BestAndSecondBestScore {
    static int[] arr = {22,23,1,4,88,23,56,12,3,5,2,88};
    public static void main(String[] args) {
        int bestScore = Integer.MIN_VALUE;
        int secondBestScore = Integer.MIN_VALUE;

        for (int value : arr){
            if(value > bestScore){
                secondBestScore = bestScore;
                bestScore = value;
            } else if(value > secondBestScore && value < bestScore){
                secondBestScore = value;
            }
        }
        System.out.println("Best Score is :: " + bestScore);
        System.out.println("Second Best Score is :: " + secondBestScore);
    }
}
