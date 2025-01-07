import java.util.Scanner;
class Q57{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j=2;
		while(i<=n2){
			j=2;
			while(j<=i){
				if(i%j==0){
					break;
				}
				j++;
			}
			if(i==j){
				System.out.println("Prime:"+i);
			}
			i++;
		}
	}
}
