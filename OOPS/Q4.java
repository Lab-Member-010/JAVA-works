import java.util.Scanner;
class Q4{
	private int a;
	private int b; 
	public Q4(int a,int b){
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
}
class TestMain{
	public static void main(String args[]){
		Q4 obj=new Q4(3,4);
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a: ");
		int i=scn.nextInt();
		obj.setValueA(i);
		System.out.print("Enter b: ");
		int j=scn.nextInt();
		obj.setValueB(j);
		obj.getA();
		obj.getB();
	}
}
