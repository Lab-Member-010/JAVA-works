import java.util.Scanner;
class Q22{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		while(i<=n){
			System.out.print((i*i*i)+" ");
			i++;
		}	
	}
}
