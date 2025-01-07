import java.util.Scanner;
class Q29{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=0;
		while(i<=n){
			i=i*10+1;
			System.out.print(i+" " );
		}	
	}
}
