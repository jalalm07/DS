package txstate.test;

public class Pattern {
    public static void main(String[] args) {
        //printStar1(4);
        printStar3(4);
        //printPatternDollarPlusMinus(5);
    }

    private static void printPatternDollarPlusMinus(int n) {
        for (int i=0; i<n; i++){
            for (int j = 0; j < n; j++){
                if(i ==j)
                    System.out.print("$ ");
                else if (j > i) {
                    System.out.print("- ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    /*
*
* */
    public static void printPattern(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i+j >= n-1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *

    */
    public static void printStar1(int n){
        for(int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStar3(int n){
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if(j >= (n -1 -i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


}
