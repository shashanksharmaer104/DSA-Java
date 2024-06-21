package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList(1);
        linkedListOne.append(2);
        linkedListOne.append(3);
        linkedListOne.append(4);

        linkedListOne.reverse();
        linkedListOne.printList();
        linkedListOne.getHead();
        linkedListOne.getTail();
        linkedListOne.getLength();

    }
}
