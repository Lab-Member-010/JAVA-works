import java.util.Scanner;
class A6{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Array length: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+(i+1)+": ");
			arr[i]=scn.nextInt();
		}
		System.out.print("Enter Number to check: ");
		int no=scn.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==no){
				System.out.print("the number "+no+" occur at index: "+i);
				break;
			}
		}
	} 
}
