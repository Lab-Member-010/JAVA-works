import java.util.Scanner;
class Q31{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=9;
		while(i<=n){
			i=i*10+9;
			System.out.print(i+" " );
		}	
	}
}
