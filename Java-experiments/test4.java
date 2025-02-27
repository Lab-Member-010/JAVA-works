import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    int id;
    String name;
    int salary;
    public Employee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class test4 {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Ram", 150);
        Employee e2=new Employee(2, "Shyam", 200);
        Employee e3=new Employee(3, "Ravi", 250);
        Employee e4=new Employee(4, "Kishan", 300);
        
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        Predicate<Employee> p=y->y.getSalary()>150;

        for (Employee x:al){
            if(p.test(x))
                System.out.println(x.getName());
        }
    }
}