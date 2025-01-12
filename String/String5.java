import java.util.Scanner;
class Reverse{
	private String s;
	public Reverse(String s){
		this.s=s;
	}
	public void reverseString(){
		String str="";
		String[] word=s.split(" ");
		for(String element:word){
			String temp=element;
			for(int i=temp.length()-1;i>=0;i--){
				char ch=temp.charAt(i);
				str=str+ch;
			}
			System.out.print(str+" ");
			str=" ";
		}
	}
}
class String5{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		Reverse obj=new Reverse(s);
		obj.reverseString();
	}	
}
