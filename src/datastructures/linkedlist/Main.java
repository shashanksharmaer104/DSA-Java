package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList(1);
        //linkedListOne.append(2);
        linkedListOne.removeFirst();

        linkedListOne.getHead();
        linkedListOne.getTail();
        linkedListOne.getLength();

        linkedListOne.printList();

    }
}
