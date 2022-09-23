package prelim;

public class MyDoublyLinkedList extends MyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;

    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(Object data) {
        DoublyNode newHead = new DoublyNode(data);
        DoublyNode currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNext(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        DoublyNode newTail = new DoublyNode(data);
        DoublyNode currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNext(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        DoublyNode removedHead = this.head;

        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNext();

        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
        return removedHead.data.toString();
    }

    public String removeTail() {
        DoublyNode removedTail = this.tail;

        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if (this.tail != null) {
            this.tail.setNext(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data.toString();
    }

    public String printList() {
        DoublyNode currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
}
