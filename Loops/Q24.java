import java.util.Scanner;
class Q24{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=0;
		while(i<=n){
			if(i%2==0){
				System.out.print((i*i)+" ");
			}
			i++;
		}	
	}
}
