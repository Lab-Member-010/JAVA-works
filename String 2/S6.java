import java.util.Scanner;
class ReplaceAll{
	private String s;
	public ReplaceAll(String s){
		this.s=s;
	}
	
	public void replaceCharacter(char n,char m){
		char ch[]=s.toCharArray();
		char counter=n;
		char character=m;
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]==counter){
				ch[i]=character;
			}
		}	
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}	
	}
}
class S6{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		ReplaceAll obj=new ReplaceAll(s);
		System.out.print("Enter character to be replaced : ");
		char n=scn.next().charAt(0);
		System.out.print("Enter character to replace with: ");
		char m=scn.next().charAt(0);
		obj.replaceCharacter(n,m);	
	}
}
