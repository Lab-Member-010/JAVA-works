import java.util.Scanner;
class SumEvenOddElements{
		public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=scn.nextInt();
		System.out.print("Enter number of columns: ");
		int m=scn.nextInt();
		int arr[][]=new int[m][n];
		int r,c;
		int sum_even=0,sum_odd=0;
		for(r=0;r<m;r++){
			System.out.print("Enter "+n+" elements of row"+(r+1)+" :");
			for(c=0;c<n;c++){
				arr[r][c]=scn.nextInt();
			}
		}
		for(r=0;r<m;r++){
			for(c=0;c<n;c++){
				if(arr[r][c]%2==0){
					sum_even=sum_even+arr[r][c];
				}else{
					sum_odd=sum_odd+arr[r][c];
				}
			}
		}
		System.out.println("Sum of all even Elements: "+sum_even);
		System.out.println("Sum of all odd Elements: "+sum_odd);
	}
}
