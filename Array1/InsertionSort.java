import java.util.Scanner;
class InsertionSort{
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
		for(i=0;i<n;i++){
			k=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>k){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=k;
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
