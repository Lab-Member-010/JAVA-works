import java.util.Scanner;
class Q61{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1=scn.nextInt();
		System.out.print("Enter Number 2: ");
		int n2=scn.nextInt();
		int i=n1;
		while(i<=n2){
			if(i%4==0){
				if(i%100==0){
					if(i%400==0){
						System.out.println("Leap year: "+i);
					}else{
						System.out.println("\n ");
					}
				}else{
					System.out.println("Leap Year: "+i);
				}
			}
			i++;
		}
	}
}
