interface Taxable{
  final static double salesTax = 7;
  final static double incomeTax = 10.5;
  double calcTax();
}
class Employee implements Taxable{
  private int empId;
  private String name;
  private int salary;
  public Employee(int id, String name, int salary){
    this.empId = id;
    this.name = name;
    this.salary = salary;
  }
  public double calcTax(){
    double intax = (10.5 / 100.0) * (12 * salary);
    return intax;
  }
  public void getE(){
    System.out.println(empId);
    System.out.println(name);
    System.out.println(salary);
  }
}
class Product implements Taxable{
  private int pId;
  private int price;
  private int quantity;
  public Product(int id, int price, int quantity){
    this.pId = id;
    this.price = price;
    this.quantity = quantity;
  }
  public double calcTax(){
    double saletax = (7.0 / 100.0) * price;
    double totalsale = saletax * quantity;
    return totalsale;
  }
  public void getP(){
    System.out.println(pId);
    System.out.println(price);
    System.out.println(quantity);
  }
}
public class Oops12Main{
  public static void main(String ar[]){
    System.out.println("employe info:");
    Employee e1 = new Employee(1, "mohit", 3000);
    e1.getE();
    System.out.println(e1.calcTax());
    System.out.println("product info:");
    Product p1 = new Product(2, 300, 4);
    p1.getP();
    System.out.println(p1.calcTax());
  }
}