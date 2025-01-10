import java.util.Scanner;
class Q8{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Medical Cause");
		char ch = sc.next().charAt(0);
		
		if(ch=='y' || ch=='Y'){
			System.out.println("Allow Student");
		}else if(ch=='n' || ch=='N'){
			System.out.println("Not Allow Student");
		}else{
			System.out.println("Not allowed");
		}
	}
}
