import java.util.ArrayList;
public class ClassSection {
    String subject;
    int capacity;
    int yearLevel;

    ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String s, int c, int y) {
        subject = s;
        capacity = c;
        yearLevel = y;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String s) {
        subject = s;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int sc) {
        capacity = sc;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yl) {
        yearLevel = yl;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        boolean add = true;
        for (Student stu: students){
            if (stu.equals(s)) add=false;
        }
        if (s.getYearLevel() != this.yearLevel) add=false;
        if (add) students.add(s);

    }


    public void removeStudent(Student s) {
        students.remove(students.indexOf(s));
    }

    public boolean isStudentEnrolled(Student s) {
        for (Student stu : students) {
            if (s.equals(stu)) return true;
        }
        return false;
    }

    public String toString() {
        String s = "";
        if (students==null) s = "[]";
        else{
            s = students.toString();
        }

        return "ClassSection{subject='" + this.subject + "', capacity=" + this.capacity + ", yearLevel=" + this.yearLevel + ", students=" + s + "}";

    }

}