package prelim;

import java.util.NoSuchElementException;

public class MyDoublyLinkedCircularList<E> implements MyList<E>{
    DoublyLinkedNode<E> head;

    public MyDoublyLinkedCircularList(E data){
        head = new DoublyLinkedNode<>(data);
        head.setNext(head);
        head.setPrev(head);
    }

    @Override
    public int getSize() {
        DoublyLinkedNode<E> x = head;
        DoublyLinkedNode<E> nxt = x.getNext();
        int s;

        for(s = 1; nxt != head; s++){ //stop loop when the current node's link is equal to the head?
            x = nxt;
            nxt = x.getNext();
        }

        return s;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        DoublyLinkedNode<E> element = new  DoublyLinkedNode(data);
        DoublyLinkedNode<E> p = head;

        if (head.getNext() == head) {
            head.setNext(element);
        }
        else {
            while(p.getNext() != head){
                p = p.getNext();
            }
            p.setNext(element);
        }

        element.setNext(head);
        head.setPrev(element);

    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        DoublyLinkedNode<E> x = head;
        DoublyLinkedNode<E> nxt = x.getNext();
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
        DoublyLinkedNode<E> x = head;
        DoublyLinkedNode<E> nxt = x.getNext();
        int i = search(data), p;
        if(-1 < i){
            for(p = 0; p < i-1; p++ ){
                x = nxt;
                nxt = x.getNext();
            }
            nxt = nxt.getNext();
            x.setNext(nxt);
            nxt.setPrev(x);

            return true;
        }
        return false;
    }

    @Override
    public int search(E data) {
        DoublyLinkedNode<E> x = head;
        DoublyLinkedNode<E> nxt = x.getNext();
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
        DoublyLinkedNode<E> x = head;
        DoublyLinkedNode<E> nxt = x.getNext();

        while (nxt != head) {
            System.out.println(x.getData());
            x = nxt;
            nxt = x.getNext();
        }

        System.out.println(x.getData());
    }
}
