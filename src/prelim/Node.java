package prelim;

public class Node <T>
{
    public T data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData()
    {
        return data;
    }

    public Node<T> getNext()
    {
        return this.next;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    public void setPreviousNode(Node<T> node) {
        this.previous = node;
    }
    public Node getPreviousNode() {
        return this.previous;
    }


}

