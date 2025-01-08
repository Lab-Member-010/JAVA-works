import java.util.Scanner;
class Multiply{
		public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=scn.nextInt();
		int arr1[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		int arr[][]=new int[n][n];
		int r,c,i;
		int sum=0;
		System.out.print("Enter elements of array 1 :");
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				arr1[r][c]=scn.nextInt();
			}
		}
		
		System.out.print("Enter elements of array2 :");
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				arr2[r][c]=scn.nextInt();
			}
		}
		
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				for(i=0;i<n;i++)
					arr[r][c] += arr1[r][i]*arr2[i][c];
			}
			
		}
		
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	
	}
}
