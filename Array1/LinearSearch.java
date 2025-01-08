import java.util.Scanner;
class LinearSearch{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,j=0,k;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.nextInt();
		}
		System.out.print("Enter the number to search: ");
		int no=scn.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==no){
				System.out.print("Number found at index: "+i);
				break;
			}
		}
	}
}
