import java.util.Scanner;
class A7{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,zerocount=0,onecount=1,twocount=0;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.nextInt();
		}
		for(i=0;i<n;i++){
			if(arr[i]==0){
				zerocount++;
			}else if(arr[i]==1){
				onecount++;
			}else if(arr[i]==2){
				twocount++;
			}
		}
		for(i=0;i<n;i++){
			if(zerocount!=0){
				arr[i]=0;
				zerocount--;
			}else if(onecount!=0){
				arr[i]=1;
				onecount--;
			}else if(twocount!=0){
				arr[i]=2;
				twocount--;
			}
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
