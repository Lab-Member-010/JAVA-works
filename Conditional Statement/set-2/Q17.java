import java.util.Scanner;
class Q17{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if(a > 0){
			System.out.println("+ sign");
		}else if(a < 0){
			System.out.println("- sign");
		}else{
			System.out.println("Zero");
		}
	}
}	
