import java.util.Scanner;
class Q28{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		while(i<=n){
			if(i%5==0){
				System.out.print("hello ");
			}else{
				System.out.print(i+" ");
			}
			i++;
		}	
	}
}
