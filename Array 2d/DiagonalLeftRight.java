import java.util.Scanner;
class DiagonalLeftRight{
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
				if(r==c){
					System.out.print(arr[r][c]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(r=0;r<m;r++){
			for(c=0;c<n;c++){
				if((r+c)==(m-1)){
					System.out.print(arr[r][c]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}
