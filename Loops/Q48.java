import java.util.Scanner;
class Q48{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j;
		while(i<=n2){
			j=1;
			while(j<=i){
				if(i%j==0){
					System.out.println("Factors of "+i+" are: "+j);
				}
				j++;
			}
			i++;
		}
	}
}
