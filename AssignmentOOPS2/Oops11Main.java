import java.util.Scanner;
abstract class Processor{
	private int member;
	public Processor(int x) {
		this.member = x;
	}
	abstract double process();
	void showData(){
		System.out.println(member);
	}
	public int getP(){

		return member;
	}
}
class Factorial extends Processor{
	int x = getP();
	int fact = 1;
	public Factorial(int y){
		super(y);
	}
	public double process(){
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		return fact;
	}
	void showData(){
		System.out.println("Fact of given no is=" + process());
	}
}
class Circle extends Processor {
	int x = getP();
	double Area = 0;
	public Circle(int y){
		super(y);

	}
	public double process(){
		Area = 3.14 * x * x;
		return Area;

	}
	void showData(){
		System.out.println("circle Area is=" + process());
	}
}
class Oops11Main{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number if no is 1 then fact if no is 2 then circle");
		int y = sc.nextInt();
		if (y == 1) {
			Processor p1 = new Factorial(5);
			p1.showData();

		}
		else if (y == 2) {

			Processor p2 = new Circle(4);
			p2.showData();
		}
	}
}
