import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Emter the Amount: ");
		int n=scn.nextInt();
		if(n>1000){
			n=n+((n*10)/100);
			System.out.println("Total: "+n);
		}else{
			System.out.println("Total: "+n);
		}
	}
}
