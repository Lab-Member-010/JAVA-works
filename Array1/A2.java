import java.util.Scanner;
class A2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		
		for(i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			
			if(min>arr[i]){
				min=arr[i];
			}
		}
		
		System.out.print("Maximum: "+max+"\nMinimum: "+min);
	}
}
