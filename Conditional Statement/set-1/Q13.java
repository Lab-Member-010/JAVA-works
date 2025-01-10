import java.util.Scanner;
class Q13{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scn.nextInt();
		n=++n;
		switch(n%7){
			case 1: System.out.println("monday"); break;
			case 2: System.out.println("tuesday"); break;
			case 3: System.out.println("wednesday"); break;			
			case 4: System.out.println("thursday"); break;
			case 5: System.out.println("friday"); break;
			case 6: System.out.println("saturday"); break;
			default: System.out.println("sunday"); 
		}
	}
}
