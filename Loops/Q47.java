import java.util.Scanner;
class Q47{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int n1=scn.nextInt();
		System.out.println("Enter Number2: ");
		int n2=scn.nextInt();
		int i=n1,j;
		if(n2>n1){
			while(i<=n2){
				j=1;
				while(j<=10){
					System.out.println(i+"x"+j+"="+(i*j));
					j++;
				}	
				System.out.println();
				i++;	
			} 		
		}else{
			System.out.print("Invalid Limits");
		}
	}
}

