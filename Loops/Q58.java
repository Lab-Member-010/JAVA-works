import java.util.Scanner;
class Q58{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i,j;
		int arr[]=new int[15];
		for(i=1;n>=1;i++){
			j=n%2;
			arr[i]=j;
			n=n/2;
		}

		System.out.print("Binary: ");
		for(i=14;i>=1;i--){
			System.out.print(arr[i]+" ");
		}
	}
}
