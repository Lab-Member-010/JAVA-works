import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int n=scn.nextInt();
		if(n<=100 && n>60){
			System.out.println("I div");		
		}else if(n<=60 && n>45){
			System.out.println("II div");		
		}else if(n<=45 && n>33){
			System.out.println("III div");		
		}else if(n<33 && n>=0){
			System.out.println("Fail");		
		}else{
			System.out.println("Invalid choice");		
		}
	}
}
