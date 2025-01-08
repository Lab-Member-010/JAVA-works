import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+i+":");
			arr[i]=scn.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.print("Minimum: "+min+"\nMaximum: "+max);
	}
}
