import java.util.Scanner;
class SelectionSort{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,j=0;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.nextInt();
		}
		for(i=0;i<n-1;i++){
		int min=i;
			for(j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
			}
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
