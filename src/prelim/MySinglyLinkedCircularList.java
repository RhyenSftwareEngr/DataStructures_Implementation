package prelim;

import java.util.NoSuchElementException;

public class MySinglyLinkedCircularList<E> implements MyList<E> {
    Node<E> head;

    public MySinglyLinkedCircularList(E data){
        head = new Node<>(data);
        head.setNext(head);
    }

    @Override
    public int getSize() {
        Node<E> x = head;
        Node<E> nxt = x.getNext();
        int s;

        for(s = 1; nxt != head; s++){ //stop loop when the current node's link is equal to the head?
            x = nxt;
            nxt = x.getNext();
        }

        return s;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        Node<E> element = new Node<>(data);
        Node<E> p = head;

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

        while (nxt != head) {
            System.out.println(x.getData());
            x = nxt;
            nxt = x.getNext();
        }

        System.out.println(x.getData());
    }
}
