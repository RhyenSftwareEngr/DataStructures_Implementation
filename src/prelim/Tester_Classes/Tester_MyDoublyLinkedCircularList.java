package prelim.Tester_Classes;

import prelim.ListOverflowException;
import prelim.MyDoublyLinkedCircularList;

public class Tester_MyDoublyLinkedCircularList {
    public static void main(String[] args) {
        Tester_MyDoublyLinkedList tester_myDoublyLinkedList = new Tester_MyDoublyLinkedList();
        tester_myDoublyLinkedList.run();
    }
    public void run() throws ListOverflowException {
        MyDoublyLinkedCircularList myDoublyLinkedCircularList = new MyDoublyLinkedCircularList(2);
        myDoublyLinkedCircularList.showElements();
    }
}
