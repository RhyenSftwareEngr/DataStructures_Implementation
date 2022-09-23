package prelim.Tester_Classes;

import prelim.MySinglyLinkedList;

public class Tester_MySinglyLinkedList {
    public static void main(String[] args) {
        Tester_MySinglyLinkedList tester_mySinglyLinkedList = new Tester_MySinglyLinkedList();
        tester_mySinglyLinkedList.run();
    }
    public void run(){
        MySinglyLinkedList sList = new MySinglyLinkedList();
        sList.addAtHead(7);
        sList.addAtTail(2);
        sList.addAtHead(3);
        sList.addAtHead(4);
        sList.printList();
        sList.deleteFromHead();
        System.out.println("Successfully deleted the node from head");
        sList.printList();
    }
}
