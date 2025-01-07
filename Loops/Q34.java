import java.util.Scanner;
class Q34{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=1,sum=0;
		while(i<n){
			if(n%i==0){
				sum=sum+i;
			}
			i++;
		}	
		
		if(sum==n){
			System.out.print("Number is perfect");
		}else{
			System.out.print("Number is not perfect");
		}
	}
}
