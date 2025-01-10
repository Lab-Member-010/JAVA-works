import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Emter the Age: ");
		int n=scn.nextInt();
		if(n>5){
			System.out.println("bonus: 5%");
		}else{
			System.out.println("bonus: 0%");
		}
	}
}
