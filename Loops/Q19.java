import java.util.Scanner;
class Q19{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number: ");
		double n=scn.nextInt();
		double i=1;
		while(i<=n){
			if(i<n){
				System.out.print("1/"+i+" + ");
			}
			if(i==n){
				System.out.print("1/"+i);
			}
			i++;
		}
		i=1;
		double sum=0;
		while(i<=n){
			sum=sum+(1/i);
			i++;
		}
		System.out.print("Sum: "+sum);
	}
}
