import java.util.Scanner;
class Q13{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		while(n!=0){
			System.out.print(n+" ");
			n--;
		}
	}
}
