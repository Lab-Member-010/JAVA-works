import java.util.Scanner;
class Q56{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j=1,fact=1;
		while(i<=n2){
			for(fact=1,j=1;j<=i;j++){
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is   "+fact);
			i++;
		}
	}
}//
