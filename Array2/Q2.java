import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		String names[]=new String[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter name "+(i+1)+":");
			names[i]=scn.next();
		}
		System.out.print("Enter String to check:");
		String s=scn.next();
		for(int i=0;i<5;i++){
			if(s.equals(names[i])){
				System.out.print("String exist :"+s);
				break;
			}
		}
	}
}
