import java.util.Scanner;
class Q45{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i,sum=0;
		while(n>0){
			i=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println("SUM: "+sum);
	}
}

