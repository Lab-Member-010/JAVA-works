import java.util.Scanner;
class Q30{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		System.out.print(i);
		while(i<=n){
			i=i*10+1;
			System.out.print("+" +i);
		}	
	}
}
