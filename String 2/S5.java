import java.util.Scanner;
class Replace{
	private String s;
	public Replace(String s){
		this.s=s;
	}
	
	public void replaceCharacter(char n,char m){
		char ch[]=s.toCharArray();
		char counter=n;
		char character=m;
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]==counter){
				ch[i]=character;
				break;
			}
		}	
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}	
	}
}
class S5{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		Replace obj=new Replace(s);
		System.out.print("Enter character to be replaced : ");
		char n=scn.next().charAt(0);
		System.out.print("Enter character to replace with: ");
		char m=scn.next().charAt(0);
		obj.replaceCharacter(n,m);	
	}
}
