import java.util.Scanner;
class SumRow{
		public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=scn.nextInt();
		int arr[][]=new int[n][n];
		int r,c,i;
		int sumRow1=0,sumRow2=0,sumRow3=0;
		System.out.print("Enter elements of array :");
		
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				arr[r][c]=scn.nextInt();
			}
		}
		
		for(r=0;r<n;r++){
			for(c=0;c<n;c++){
				if(r==0){
					sumRow1+=arr[r][c];
				}else if(r==1){
					sumRow2+=arr[r][c];
				}else{
					sumRow3+=arr[r][c];
				}
			}
		}
	
		System.out.println("Sum of row 1: "+sumRow1);
		System.out.println("Sum of row 2: "+sumRow2);
		System.out.println("Sum of row 3: "+sumRow3);
	}
}
