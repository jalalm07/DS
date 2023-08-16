package array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadDemo {

    public static void main(String[] args) {
         List<Integer> myList  = new ArrayList();
         List<Integer> newList = new ArrayList<>();
         myList.add(5);
         myList.add(3);
         myList.add(2);
         myList.add(7);
         myList.add(10);

        newList = myList.stream().filter(val -> val%2==0).collect(Collectors.toList());
    }
}
