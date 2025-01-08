import java.util.Scanner;
class A8{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Sum: ");
		int s=scn.nextInt();
		System.out.println("Enter number of elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,j=0,k=0,sum=0;
		for(i=0;i<n;i++){
			System.out.print("Enter Element"+i+": ");
			arr[i]=scn.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				k=i;
				sum=sum+arr[j];
				if(sum==s){
					break;
				}
			}
			sum=0;
		}
		System.out.print("("+k+", "+j+")");
	}
}
