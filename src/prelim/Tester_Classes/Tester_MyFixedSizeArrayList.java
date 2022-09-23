package prelim.Tester_Classes;

import prelim.MyFixedSizeArrayList;
import prelim.Reference_Classes.Student;

public class Tester_MyFixedSizeArrayList {
    public static void main(String args[]){
        Tester_MyFixedSizeArrayList tester_myFixedSizeArrayList = new Tester_MyFixedSizeArrayList();
        tester_myFixedSizeArrayList.run();
    }

    public void run(){
        MyFixedSizeArrayList call = new MyFixedSizeArrayList<>();

        try{
            call.toString();

            Student s1 = new Student();
            Student s2 = new Student(1,"Rhy","Natividad", "BSCS");


            call.insert(new Student(2,"Erin","Avillanoza", "BSMA"));
            call.insert(s1);

            System.out.println("The current size of the array is: " + call.getSize());

            call.insert(new Student(3,"Andrea","Ebido", "BSCRIM"));
            call.insert(s2);
            call.insert(new Student(4,"Selen","Tatsuki", "BSIT"));
            System.out.println("The current size of the array is: " + call.getSize());
            call.toString();
            System.out.println("This student: "+ call.getElement(s1) + "is a placeholder");
            System.out.println("This student: "+ s2 +" can be found at the index "+ call.search(s2));
            if(call.delete(s1)){
                System.out.println("A student was removed from the list");
                call.toString();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
