import java.util.Scanner;
class Q21{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Angle1: ");
		int a1 = sc.nextInt();
		
		System.out.println("Enter Angle2: ");
		int a2 =sc.nextInt();
		
		System.out.println("Enter Angle3: ");
		int a3 =sc.nextInt();
		
		if((a1+a2+a3)==180){
			System.out.println("valid triangle");
		}else{
			System.out.println("not a valid triangle");
		}
	}
}
