import java.util.Scanner;
class Q1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int arr[]=new int[6];
		int n=arr.length;
		int i,j=n-1;
		for(i=0;i<n;i++){
			System.out.print("Enter element "+i+":");
			arr[i]=scn.nextInt();
		}
		i=0;
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
