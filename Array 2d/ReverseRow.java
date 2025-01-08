import java.util.Scanner;
class ReverseRow{
		public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=scn.nextInt();
		int arr[][]=new int[n][n];
		int r,c,i;
		int sum=0;
		System.out.print("Enter elements of array :");
		
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				arr[r][c]=scn.nextInt();
			}
		}
		
		
		for(r=0;r<n;r++){
			for(c=n-1;c>=0;c--){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	
	}
}
