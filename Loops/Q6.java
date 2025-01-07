import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		System.out.print("Factors are: ");
		while(i<=n){
			if(n%i==0){
				System.out.print(i+" ");
			}
		i++;
		}
	}
}
