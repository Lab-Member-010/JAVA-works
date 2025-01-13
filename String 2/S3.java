import java.util.Scanner;
class IndexOfCharacter{
	private String s;
	public IndexOfCharacter(String s){
		this.s=s;
	}
	
	public int indexOfCharacter(char n){
		char ch[]=s.toCharArray();
		char counter=n;
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==counter){
				break;
			}
			count++;
		}
		return count;
	}
}
class S3{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=scn.nextLine();
		IndexOfCharacter obj=new IndexOfCharacter(s);
		System.out.print("Enter Character to find: ");
		char n=scn.next().charAt(0);
		int result=obj.indexOfCharacter(n);	
		System.out.print("Index of "+n+": "+result);
	}
}
