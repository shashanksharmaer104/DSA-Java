package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList(4);
        linkedListOne.append(5);
        linkedListOne.append(6);

        linkedListOne.getHead();
        linkedListOne.getTail();
        linkedListOne.getLength();

        linkedListOne.printList();

    }
}
