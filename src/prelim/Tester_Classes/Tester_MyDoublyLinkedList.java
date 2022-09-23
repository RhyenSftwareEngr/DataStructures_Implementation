package prelim.Tester_Classes;

import prelim.MyDoublyLinkedList;

public class Tester_MyDoublyLinkedList {
    public static void main(String[] args) {
        Tester_MyDoublyLinkedList tester_myDoublyLinkedList = new Tester_MyDoublyLinkedList();
        tester_myDoublyLinkedList.run();
    }
    public void run(){
        MyDoublyLinkedList subway = new MyDoublyLinkedList();
        subway.addToHead(("Time Square"));
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.printList();
        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.printList();
        subway.removeHead();
        subway.removeTail();
        subway.printList();
        subway.removeByData("Times Square");
        subway.printList();
    }
}
