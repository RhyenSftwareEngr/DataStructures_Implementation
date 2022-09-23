package prelim;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<E> extends MyLinkedList<E>{
    int size;
    Node<E> head, tail;
    public Node<E> next;
    public Node<E> previous;

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

    @Override
    public int getSize() {
        Node<E> x = head;
        Node<E> nxt = x.getNext();
        int s;

        for(s = 1; nxt != null; s++){
            x = nxt;
            nxt = x.getNext();
        }

        size = s;
        return size;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        Node<E> element = new Node<>(data);

        if (head.getNext() == null)
            head.setNext(element);
        else
            tail.setNext(element);

        tail = element;
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        Node<E> x = head;
        Node<E> nxt = x.getNext();
        int i, s = getSize();

        for(i = 0; i < s; i++){
            if(data.equals(x.getData()))
                return x.getData();

            x = nxt;
            nxt = x.getNext();
        }

        throw new NoSuchElementException();
    }

    @Override
    public boolean delete(E data) {
        Node<E> x = head;
        Node<E> nxt = x.getNext();
        int i = search(data), p;
        if(-1 < i){
            for(p = 0; p < i-1; p++ ){
                x = nxt;
                nxt = x.getNext();
            }
            x.setNext(nxt.getNext());
            return true;
        }
        return false;
    }

    @Override
    public int search(E data) {
        Node<E> x = head;
        Node<E> nxt = x.getNext();
        int i, s = getSize();

        for(i = 0; i < s; i++){
            if(data.equals(x.getData()))
                return i;

            x = nxt;
            nxt = x.getNext();
        }

        return -1;
    }

    public void showElements(){
        Node<E> x = head;
        Node<E> nxt = x.getNext();

        while (nxt != null) {
            System.out.println(x.getData());
            x = nxt;
            nxt = x.getNext();
        }

        System.out.println(tail.getData());
    }
    public Node<E> getNext()
    {
        return this.next;
    }

    public void setNext(Node<E> next)
    {
        this.next = next;
    }
}
