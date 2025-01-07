import java.util.Scanner;
class Q49{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1,j,count=0;
		while(i<=n2){
			
			// This is the limitation of while loop that i identified
			/* 
			j=1;
			while(j<=i){
			        count=0;
				if(i%j==0){
					count=count+j;
				}
				j++;
			} 
			*/
			for(j=1,count=0;j<i;j++){
				if(i%j==0){
					count=count+j;
				}
			}
			if(count==i){
				System.out.println(j+" is the perfect number");
			}else{
				System.out.println(j+" is not perfect");
			}
			i++;
		}
	}
}
