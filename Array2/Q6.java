import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+i+":");
			arr[i]=scn.nextInt();
		}
	}
}
