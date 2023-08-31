package misc.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertFirst(int value){
        Node newNode = new Node();

        newNode.value = value;
        if(head==null)
            newNode.next = null;
        else newNode.next = head;
        head = newNode;
    }

    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    public void insertLast(int value){

        Node node = new Node();
        node.value = value;
        node.next = null;

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
    }

    public void print(){
        Node temp = head;

        while (temp !=null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }



}
