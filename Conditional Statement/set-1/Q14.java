import java.util.Scanner;
class Q14{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter marks: ");
		int s=scn.nextInt();
		
			if( s<=100 && s>=90){
				System.out.println("I div");
			}else if(s<90 && s>=80){
				System.out.println("II div");
			}else if(s<80 && s>=33){
				System.out.println("III div");
			}else{
				System.out.println("ERROR");
			}
	}
}
