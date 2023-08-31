package ds.pattern;

public class PrintDollarPlusMinus {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n){
        for (int i =0; i < n; i++){
            for(int j =0 ; j < n ; j++){
                if(i==j){
                    System.out.print("$ ");
                } else if (j>i) {
                    System.out.print("- ");
                } else System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
