package prelim;

public class DoublyLinkedNode<T> extends Node<T>{
    public int value;
    DoublyLinkedNode<T> prev;

    public DoublyLinkedNode(T data){
        super(data);
        prev = null;
    }

    @Override
    public DoublyLinkedNode<T> getNext() {
        return (DoublyLinkedNode<T>) next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = (DoublyLinkedNode<T>) prev;
    }

    public Node<T> getPrev() {
        return prev;
    }
}
