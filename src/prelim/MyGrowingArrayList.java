package prelim;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyGrowingArrayList<E> implements MyList<E>
{
    int studentId, age, yearOfGrad; //data
    public static MyGrowingArrayList head=null; //head of the list
    MyGrowingArrayList next;
    public static Object[]  list;
    public int size = 0;
    private int length = 5;
    static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
//    MyGrowingArrayList call = new MyGrowingArrayList();

    public MyGrowingArrayList() {
        this.list = new Object[5];
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void insert(E data)
    {

        if (size == list.length) {
            int newSize = list.length * 2;
            Object[] newList = new Object[newSize];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        list[size] = data;
        size++;
    }

    @Override
    public E getElement(E data) throws NoSuchElementException
    {
        Object element = null;
        for (Object ele: list) {
            if (data == ele) {
                element = ele;
            }
        }

        if (element == null)
            throw new NoSuchElementException("No such element exists: "+ data);
        return (E) element;
    }

    @Override
    public boolean delete(E data)
    {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i] == data) {
                index = i;
            }
        }
        if (index > -1) {
            final int newSize;
            if ((newSize = size - 1) > index) {
                // copying elements by excluding  element to be deleted
                System.arraycopy(list, index + 1, list, index, newSize - index);
            }
            list[size = newSize] = null;
            return true;
        }

        return false;
    }

    @Override
    public int search(E data) {
        for (int entity = 0; entity < length; entity++) {
            if(list[entity].equals(data)){
                return entity;
            }
        }
        return -1;
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("");
        for (int i = 0; i < size; i++) {
            Object ele = list[i];
            if (ele != null) {
                str.append(ele.toString());

                if (i != size - 1) {
                    str.append(",");
                }
            }
        }
        str.append("");
        return str.toString();
    }
}