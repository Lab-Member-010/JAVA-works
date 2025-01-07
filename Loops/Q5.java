import java.util.Scanner;
class Q5{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=1,fact=1;
		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.print("Factorial: "+fact);
	}
}
