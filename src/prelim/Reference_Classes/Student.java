package prelim.Reference_Classes;
public class Student {
    String fName, lName;
    String curriculum;
    int id;

    public Student() {
        fName = "Jane";
        lName = "Doe";
        curriculum ="BSCS";
        id = 123;
    }
    public Student(int id, String fn, String ln, String c){
        this.id = id;
        fName = fn;
        lName = ln;
        curriculum = c;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName){
        this.lName = lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }



    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getCurriculum() {
        return curriculum;
    }

    @Override
    public String toString() {
        return id +" "+ fName +" "+ lName +" "+ curriculum;
    }
}