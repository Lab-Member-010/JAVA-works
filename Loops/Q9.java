import java.util.Scanner;
class Q9{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		while(i<=n){
			if(i%2==0){
				System.out.print(i+" ");
			}
		i++;
		}
	}
}
