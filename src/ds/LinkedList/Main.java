package ds.LinkedList;

import misc.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        //linkedList.print();
       // linkedList.removeLast();
        //linkedList.removeLast();
        //linkedList.removeLast();
        //linkedList.removeLast();

        //linkedList.print();
        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.removeLast();
        linkedList.print();

    }
}
