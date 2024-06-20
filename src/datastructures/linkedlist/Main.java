package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList(11);
        linkedListOne.append(3);
        linkedListOne.append(23);
        linkedListOne.append(7);
        linkedListOne.append(4);
        linkedListOne.removeLast();

        linkedListOne.getHead();
        linkedListOne.getTail();
        linkedListOne.getLength();

        linkedListOne.printList();

    }
}
