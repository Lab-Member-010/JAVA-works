import java.util.Scanner;
class LastIndexOfCharacter{
	private String s;
	public LastIndexOfCharacter(String s){
		this.s=s;
	}
	
	public int lastIndexOfCharacter(char n){
		char ch[]=s.toCharArray();
		char counter=n;
		int count=ch.length-1;
		for(int i=ch.length-1;i>=0;i--){
			if(ch[i]==counter){
				break;
			}
			count--;
		}
		
		return count;
	}
}
class S4{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		LastIndexOfCharacter obj=new LastIndexOfCharacter(s);
		System.out.print("Enter Character to find: ");
		char n=scn.next().charAt(0);
		int result=obj.lastIndexOfCharacter(n);	
		System.out.print("Last Index of "+n+": "+result);
	}
}
