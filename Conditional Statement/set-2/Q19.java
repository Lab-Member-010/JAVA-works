import java.util.Scanner;
class Q19{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Side");
		int s1 = sc.nextInt();
		
		System.out.println("Enter Second Side");
		int s2 = sc.nextInt();
		
		System.out.println("Enter third Side");
		int s3 = sc.nextInt();
		
		if(s1 == s2 && s2 == s3){
			System.out.println("equilateral");
		}else if(s1 == s2 || s1 == s3 || s2 == s3 || s1 == s3){
			System.out.println("isosceles");
		}else{
			System.out.println("scalene");
		}
	}
}

