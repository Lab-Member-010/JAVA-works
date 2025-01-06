class Employee{
	private int empId;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		this.empId = id;
		this.name = name;
		this.salary = salary;

	}
	public String toString(){
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
		return "";
	}
	public boolean equals(Employee e1) {
		if (this.empId == e1.empId) {
			System.out.println("id is already exixt");

		}
		return true;
	}
}
public class Oops13Main{
	public static void main(String ar[]){
		Employee e1 = new Employee(1, "ram", 5000);
		Employee e2 = new Employee(2, "sam", 6000);
		Employee e3 = new Employee(3, "tam", 7000);
		Employee e4 = new Employee(4, "uam", 8000);
		Employee e5 = new Employee(5, "vam", 9000);
		Employee ep[] = new Employee[5];
		ep[0] = e1;
		ep[1] = e2;
		ep[2] = e3;
		ep[3] = e4;
		ep[4] = e5;
		for (Employee e6 : ep) {
			System.out.println(e6.toString());
		}
	}
}