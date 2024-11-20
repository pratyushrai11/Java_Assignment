import java.util.ArrayList;
import java.util.Collections;

class Student {
    int age;
    double mask;
    String name;
    public Student(int age, double mask, String name) {
        super();
        this.name = name;
        this.age = age;
        this.mask = mask;
    }
    public String toString() {
        return name + " " + age + " " + mask;
    }
    public int compareto(Object o) {
        Student s = (Student) o;
        if(this.age>s.age)
        {
            return 1;
        }
        else if (this.age<s.age)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> dsai = new ArrayList<Student>();
         dsai.add(new Student(21, 23, "Ankit" ));
         dsai.add(new Student(23, 34, "Ramesh "));
        System.out.println(dsai);

    }
}
