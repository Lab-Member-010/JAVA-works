import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=scn.nextInt();
		int i=1,sum=0;
		while(i<=n){
			sum=sum+i;
			i++;
		}		
		System.out.print("sum: "+sum);
	}
}
