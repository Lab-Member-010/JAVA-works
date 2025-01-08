import java.util.Scanner;
class A4{
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
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				if(arr[i]<=arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
