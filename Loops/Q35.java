import java.util.Scanner;
class Q35{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scn.nextInt();
		int i=0;
		while(n!=0){
			n=n/10;
			i++;
		}	
		System.out.print("Total Digits: "+i);
	}
}
