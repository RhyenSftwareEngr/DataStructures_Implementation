package prelim;

public class DoublyNode <T>
{
    public T data;
    public DoublyNode<T> next;
    public DoublyNode<T> previous;

    public DoublyNode(T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData()
    {
        return data;
    }

    public DoublyNode<T> getNext()
    {
        return this.next;
    }

    public void setNext(DoublyNode<T> next)
    {
        this.next = next;
    }
    public void setPreviousNode(DoublyNode<T> node) {
        this.previous = node;
    }
    public DoublyNode getPreviousNode() {
        return this.previous;
    }


}