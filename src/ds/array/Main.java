package ds.array;

public class Main {
    public static void main(String[] args) {

        //insertion in array
        SingleDimentionArray singleDimentionArray = new SingleDimentionArray(7);
        singleDimentionArray.insert(0,11);
        singleDimentionArray.insert(1,12);
        singleDimentionArray.insert(2,13);
        singleDimentionArray.insert(3,14);
        singleDimentionArray.insert(4,15);
        singleDimentionArray.insert(5,16);


        //accessing array
        int var = singleDimentionArray.arr[2];
        System.out.println("Var contains :: " + var);

        //traversing the array
        singleDimentionArray.arrayTraverse();

        //array search
        singleDimentionArray.arraySearch(13);

        //delete element from an array - we cannot delete from array so setting value to minimum int value
        singleDimentionArray.deletevalue(1);
        singleDimentionArray.arrayTraverse();


    }
}