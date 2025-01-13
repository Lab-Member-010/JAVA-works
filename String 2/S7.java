import java.util.Scanner;
class ToCharacterArray{
	private String s;
	public ToCharacterArray(String s){
		this.s=s;
	}
	
	public char[] toCharacterArray(){
		char ch[]=new char[s.length()];
		int n=s.length();
		for(int i=0;i<n;i++){
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
}
class S7{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		ToCharacterArray obj=new ToCharacterArray(s);
		char ch_array[]=obj.toCharacterArray();	
		int n=s.length();
		for(int i=0;i<n;i++){
			System.out.print(ch_array[i]+" ");
		}
	}
}
