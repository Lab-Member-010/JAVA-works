import java.util.Scanner;
class A1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,result=0;	
		System.out.print("Enter Elements: ");
		for(i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		
		if(n==1){
			result=1;
		}else if(n<=0){
			result=0;
		}else if(n>1){
			for(i=0;i<n-1;i++){
				if(i==0){
					if(arr[i]>arr[i+1]){
						result=1;
					}
			       	}else if(i<(n-1)){
					if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
						result=1;
					}
				}else if(i==(n-1)){
					if(arr[i]>arr[i-1]){
						result=1;
					}
				}else{
					result=0;
				}
			}
		}
		System.out.println("result: "+result);
	}
}
