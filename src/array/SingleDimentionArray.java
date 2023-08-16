package array;

public class SingleDimentionArray {
    public int[] arr = null;

    public SingleDimentionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Value inserted successfully");
            } else {
                System.out.println("Value is alreay present at this location");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index given");
        }

    }

    //array traversal

    public void arrayTraverse(){
        for (int i =0; i < arr.length; i++){
            System.out.println("Array ar i=:"+i + " is : " + arr[i]);
        }
    }

    //array search

    public void arraySearch(int valueToSearch){
        for (int i=0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value found at location : " + i);
                return;
            }
        }
        System.out.println("value not found");
    }

    //delete from array
    public void deletevalue(int location){
        try {
            arr[location] = Integer.MIN_VALUE;
            System.out.println("Value deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e){

        }
    }


}
