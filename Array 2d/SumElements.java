import java.util.Scanner;
class SumElements{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=scn.nextInt();
		System.out.print("Enter number of columns: ");
		int m=scn.nextInt();
		int arr[][]=new int[m][n];
		int r,c;
		int sum=0;
		for(r=0;r<m;r++){
			System.out.print("Enter "+n+" elements of row"+(r+1)+" :");
			for(c=0;c<n;c++){
				arr[r][c]=scn.nextInt();
			}
		}
		for(r=0;r<m;r++){
			for(c=0;c<n;c++){
				sum=sum+arr[r][c];
			}
		}
		System.out.println("Sum of all Elements: "+sum);
	}
}
