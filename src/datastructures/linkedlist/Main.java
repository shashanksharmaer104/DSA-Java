package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList(1);
        linkedListOne.append(2);
        linkedListOne.append(3);
        linkedListOne.append(4);

        linkedListOne.getHead();
        linkedListOne.getTail();
        linkedListOne.getLength();

        //linkedListOne.printList();

        System.out.println("Value at index 1: " + linkedListOne.get(0).value);

        linkedListOne.set(1, 50);
        linkedListOne.printList();

    }
}
