import java.util.Scanner;
class Length{
	private String s;
	public Length(String s){
		this.s=s;
	}
	
	public void PrintString(){
		System.out.println("String: "+s);
	}
	
	public int count(){
		int counter=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			counter++;
		}
		return counter;
	}
}
class S1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		Length obj=new Length(s);
		obj.PrintString();
		int result=obj.count();
		System.out.print("Length: "+result);
	}
}
