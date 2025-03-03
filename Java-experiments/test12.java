import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    int id;
    String name;
    int marks;
    public Student(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
public class test12 {
    public static void main(String[] args) {
        Student[] s={
            new Student(101,"joy",98),
            new Student(102,"roy",30),
            new Student(103,"roy",69),
            new Student(104,"noy",47)
        };
        Function<Student,String> f=y->{
            int marks=y.getMarks();
            String grade;
            if(marks<=100 && marks>=80)
                grade="A";
            else if(marks<80 && marks>=60)
                grade="B";
            else if(marks<60 && marks>=33)
                grade="C";
            else if(marks<33 && marks>=0)
                grade="fail";
            else
                grade="invaild marks";

            return grade;
        };
        Consumer<Student> c=x->{
            System.out.println("id:"+x.getId()+" name:"+x.getName()+" grade:"+f.apply(x));
        };
    }
}