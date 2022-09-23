package prelim;

public class ListOverflowException extends Exception {
    public ListOverflowException() {
        super("This list is full");
    }
}
