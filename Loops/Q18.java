import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=1,f,f1=1,f2=2;
		System.out.print(f1+" "+f2+" ");
		while(i<=n){
			f=f1*f2;
			System.out.print(f+" ");
			f1=f2;
			f2=f;
			f=f1;
			i++;
		}		
	}
}
