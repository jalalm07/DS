package txstate.test;

public class Multiples {

    public static void main(String[] args) {
        multiples(7);
    }

    public static void multiples(int n){
            for (int j = 1; j <= 30; j++){
                System.out.print(n*j + " ");
                if(j % 10 == 0)
                    System.out.println();
            }
    }
}
