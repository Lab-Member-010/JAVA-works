import java.util.Scanner;
class Q52{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j,sum=0,temp=0;
		while(i<=n2){
			for(sum=0,temp=i,j=0;temp>0;){
				j=temp%10;
				sum=sum+(j*j*j);
				temp=temp/10;
			}
			if(sum==i){
				System.out.println(i+" is armstrong");
			}
			i++;
		}
	}
}
