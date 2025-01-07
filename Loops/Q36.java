import java.util.Scanner;
class Q36{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		System.out.println("Number: "+n);
		int rev=0,i;
		while(n>0){
			i=n%10;
			rev=rev*10+i;
			n=n/10;
		}	
		System.out.print("Reverse: "+rev);
	}
}
