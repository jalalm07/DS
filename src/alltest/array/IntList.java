package alltest.array;

import java.util.Arrays;

public class IntList {
    int[] num;
    int lastElemntIndex;

    public IntList(){
        num = new int[4];
        lastElemntIndex = -1;
    }

    public void add(int value){
        if(lastElemntIndex  >= 3){
            //System.out.println();
            return;
        } else {
            num[++lastElemntIndex] = value;
        }
    }

    public double mean(){
        int sum = 0;
        for(int i = 0; i <= lastElemntIndex; i++){
            sum += num[i];
        }
        return (double) sum / (lastElemntIndex + 1);
    }

    public boolean allPositive(){
        if (lastElemntIndex == -1) return true;
        for(int i =0; i<= lastElemntIndex; i++){
            if(num[i] <= 0)
                return false;
        }
        return true;
    }

    public void sort(){
        //int n = num.length;

        for (int i = 0; i <= lastElemntIndex; i++) {
            // Last i elements are already in place, so we don't need to check them
            for (int j = 0; j <= lastElemntIndex - i -1; j++) {
                // Swap if the element found is greater than the next element
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        IntList intList = new IntList();
        intList.add(2); //1
        intList.add(4);// 2
        intList.add(8);  //4
        intList.add(1); //8
        //intList.add(5);


        System.out.println(Arrays.toString(intList.num));
        intList.sort();
        System.out.println(Arrays.toString(intList.num));
        System.out.println(intList.lastElemntIndex);
        System.out.println("mean is ::: " + intList.mean());
        System.out.println(intList.allPositive());
    }


}
