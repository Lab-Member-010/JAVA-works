import java.util.Scanner;
class Q9{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if(a > 0){
			System.out.println("Positive");
		}
		else if(a < 0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}
