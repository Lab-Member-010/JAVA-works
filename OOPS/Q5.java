import java.util.Scanner;
class Q5{
	private int a;
	private int b; 
	public Q5(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void setValueA(int i){
		this.a=i;
	}
	public void setValueB(int j){
		this.b=j;
	}	
	public void getA(){
		System.out.println("A: "+a);
	}
	public void getB(){
		System.out.println("B: "+b);
	}
	public int add(){
		return a+b;
	}
	public int substract(){
		return a-b;	
	}
	public int multiply(){
		return a*b;
	}
	public int divide(){
		return a/b;
	}
}
class TestMain{
	public static void main(String args[]){
		Q5 obj=new Q5(3,4);
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a: ");
		int i=scn.nextInt();
		obj.setValueA(i);
		System.out.print("Enter b: ");
		int j=scn.nextInt();
		obj.setValueB(j);
		obj.getA();
		obj.getB();
		System.out.println("Add: "+obj.add());
		System.out.println("Substract: "+obj.substract());
		System.out.println("Multiply: "+obj.multiply());
		System.out.println("Divide: "+obj.divide());		
	}
}
