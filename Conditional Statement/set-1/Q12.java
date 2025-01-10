import java.util.Scanner;
class Q12{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in 4 Digit..");
		int num = sc.nextInt();
		
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
		
		num = num / 10;
		System.out.print(num % 10);
	}
}
