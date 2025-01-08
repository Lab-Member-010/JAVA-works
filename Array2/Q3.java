import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.print("Enter Element "+i+":");
			arr[i]=scn.nextInt();
			sum+=arr[i];
		}
		System.out.print("Sum: "+sum);
	}
}
