package prelim.Tester_Classes;

import prelim.ListOverflowException;
import prelim.MySinglyLinkedCircularList;

public class Tester_MySingularLinkedCircularList {
    public static void main(String[] args) throws ListOverflowException {
        Tester_MySingularLinkedCircularList tester_mySingularLinkedCircularList = new Tester_MySingularLinkedCircularList();
        tester_mySingularLinkedCircularList.run();
    }
        public void run() throws ListOverflowException {
            MySinglyLinkedCircularList mySinglyLinkedCircularList = new MySinglyLinkedCircularList(1);
            mySinglyLinkedCircularList.insert("Hi ");
            mySinglyLinkedCircularList.insert("I am ");
            mySinglyLinkedCircularList.insert("I am Rhyen");
            mySinglyLinkedCircularList.showElements();
        }
    }