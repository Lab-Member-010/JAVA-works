import java.util.Scanner;
class Q7{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Age");
		int a = sc.nextInt();
		
		System.out.println("Enter b Age");
		int b = sc.nextInt();
		
		System.out.println("Enter c Age");
		int c = sc.nextInt();
		
		if(a > b && a > c){
			System.out.println("a is Greater");
		}
		if(b > a && b > c){
			System.out.println("b is Greater");
		}
		if(c > a && c > b){
			System.out.println("c is Greater");
		}
	}
}

