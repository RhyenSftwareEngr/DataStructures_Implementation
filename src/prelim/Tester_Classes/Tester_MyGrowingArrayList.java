package prelim.Tester_Classes;

import prelim.MyGrowingArrayList;
import prelim.Reference_Classes.Student;
import prelim.Reference_Classes.Task;


import java.util.NoSuchElementException;

public class Tester_MyGrowingArrayList {
    public static void main(String args[]){
        Tester_MyGrowingArrayList tester_myGrowingArrayList = new Tester_MyGrowingArrayList();
        tester_myGrowingArrayList.run();
    }

    public void run(){
        MyGrowingArrayList growingList = new MyGrowingArrayList();
//        RandomGeneratedNumbers ran = new RandomGeneratedNumbers(1);
        Task task1 = new Task("CFE Prelim Exam", 2022-10-11);
        Task task2 = new Task("NTSP Prelim Exam", 2022-10-11);
        Task task3 = new Task("DS Prelim Exam", 2022-10-11);
        Task task4 = new Task("GRVA Prelim Exam", 2022-10-11);
        Task task5 = new Task(" GSTS Prelim Exam", 2022-10-11);
        Task task6 = new Task("OS Prelim Exam", 2022-10-11);
        growingList.insert(task1);
        growingList.insert(task2);
        growingList.insert(task3);
        growingList.insert(task4);
        growingList.insert(task5);
        System.out.println("List : " + growingList.toString() + " ");
        System.out.println("Adding 6th element");
        growingList.insert(task6);
        System.out.println("List : " + growingList.toString());
        // here it should add without exception
        Task task7 = new Task("HCI Prelim Exam", 2022-10-11);
        System.out.println("Adding 7th element");
        growingList.insert(task7);
        System.out.println("List : " + growingList.toString());
        System.out.println("size : "+ growingList.getSize());

        growingList.delete(task7);
        System.out.println("After removing task 7: "+ growingList.toString());

        System.out.println("Search element task 2: "+ growingList.search(1)); // returns index of data, else -1 is return

        try {
            System.out.println("get element task 5: "+ growingList.getElement(task5));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

}
