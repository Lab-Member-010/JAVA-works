import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=scn.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(n+" x "+i+" = "+(n*i));
			i++;
		}
	}
}