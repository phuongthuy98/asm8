import javax.naming.Name;

public class Student  implements Comparable<Student>{
    public int ID;
    public String Name;
    public int Age;
    public String Address;
    public double Gpa;

    public Student (int ID, String Name, int Age, String Address, double Gpa){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Gpa = Gpa;
    }
    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return this.Name.compareTo(o.Name);
    }

}
