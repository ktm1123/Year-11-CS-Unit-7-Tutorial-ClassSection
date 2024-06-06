
public class Student {
    private int id=77;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String fn, String ln, int ag, int yl){
        firstName=fn;
        lastName=ln;
        age=ag;
        yearLevel=yl;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String f){
        firstName=f;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String l){
        lastName=l;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int x){
        age = x;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int y){
        yearLevel=y;
    }

    public boolean equals(Student student){
        int ref = 0;
        if (this.firstName.equals(student.firstName)) ref++;
        if (this.lastName.equals(student.lastName)) ref++;
        if (this.age == student.getAge()) ref++;
        if (this.yearLevel==student.getYearLevel()) ref++;
        if (ref==4) return true;
        return false;
    }

    public String toString(){
        return "Student{" + "id=" + this.id +  ", " + "firstName=" + "'" +
                this.firstName + "', " + "lastName=" + "'" + this.lastName + "', " + "age=" + this.age + ", " + "yearLevel=" + this.yearLevel + "}";

    }
}
