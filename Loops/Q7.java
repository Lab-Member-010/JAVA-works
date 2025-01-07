import java.util.Scanner;
class Q7{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=2;
		while(i<=n){
			if(n%i==0){
				break;
			}
			i++;
		}
		if(n==i){
			System.out.print("Prime");
		}else{
			System.out.println("Not Prime");			
		}
	}
}
