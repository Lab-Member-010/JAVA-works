import java.util.Scanner;
class Q54{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1;
		while(i<=n2){
			if(i%2==0){
				System.out.println(i+"  ");
			}
			i++;
		}
	}
}
