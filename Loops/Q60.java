import java.util.Scanner;
class Q60{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		double n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		double n2=scn.nextInt();
		double i=n1;
		while(i<=n2){
			System.out.println("Number: "+i);
			System.out.println("Square:"+(i*i));
			System.out.println("Cube: "+(i*i*i));
			System.out.println("Square Root: "+Math.sqrt(i));
			System.out.println(" ");
			i++;
		}
	}
}
