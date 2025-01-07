import java.util.Scanner;
class Q53{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j=1,k=1,fact=1,temp=0,sum=0;
		while(i<=n2){
			for(temp=i;temp>0;i++){
				j=temp%10;
				fact=1;
				sum=0;
				for(k=1;k<=j;k++){
					fact=fact*k;
				}
				sum=sum+fact;
				temp=temp/10;
			}
			System.out.println("SUM: "+sum);
			if(sum==i){
				System.out.println(sum+" is Strong");
			}
		}
	}
}
