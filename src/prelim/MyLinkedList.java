package prelim;
import java.util.NoSuchElementException;
public class MyLinkedList<E> implements MyList<E> {
    /**
     Constructor that constructs an empty LinkedList
     */
    public Node head;
    public Node tail;
    private int size = 0; // Number of elements in the list
    /**
     Constructor that constructs an empty LinkedList
     */
    public MyLinkedList() {

    }
    public int getSize() {
        return this.size;
    }
    public void insert(E data) throws ListOverflowException {
        addAtTail(data);
    }

    public E getElement(E data) throws NoSuchElementException {
        search(data);
        return null;
    }
    public boolean delete(E data) { // returns false if the data is not deleted in the list
        removeByData((String) data);
        return false;
    }

    @Override
    public int search(E data) {
        return -1;
    }
    public void addAtTail(E item) {
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(item);
        }
        else{
            while(tail.getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(item));
        }
        this.size++;
    }
    public void addAtHead(E item) {
        Node newHead = new Node(item);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead != null){
            this.head.setNext(currentHead);
        }
        this.size++;
    }
    public String deleteFromHead(){
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        }
        this.head = removedHead.getNext();
        this.size--;
        return removedHead.data.toString();
    }
    public void deleteFromTail() {
        if (this.head == null) return;
        if (this.head.getNext() == null) {
            deleteFromHead();
        }
        Node preLast = this.head;
        while (preLast.getNext().getNext() != null) {
            preLast = preLast.getNext();
        }
        this.size--;
        preLast.setNext(null);
    }
    public Node removeByData(String data) {
        Node nodeToRemove = null;
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNext();
        }

        if (nodeToRemove == null) {
            return null;
        }
        if (nodeToRemove == this.head) {
            this.deleteFromHead();
        } else if (nodeToRemove == this.tail) {
            this.deleteFromTail();
        } else {
            Node nextNode = nodeToRemove.getNext();
            Node previousNode = nodeToRemove.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNext(nextNode);
        }
        return nodeToRemove;
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
//    This if for circular

}
