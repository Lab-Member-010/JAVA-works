import java.util.Scanner;
class CharacterAt{
	private String s;
	public CharacterAt(String s){
		this.s=s;
	}
	
	public void characterIndex(int n){
		char ch[]=s.toCharArray();
		int counter=n;
		System.out.print("character at index "+counter+": "+ch[counter]);
	}
}
class S2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		CharacterAt obj=new CharacterAt(s);
		System.out.print("Enter index: ");
		int n=scn.nextInt();
		obj.characterIndex(n);	
	}
}
