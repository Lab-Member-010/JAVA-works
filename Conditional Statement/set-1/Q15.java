import java.util.Scanner;
class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter K.M.");
		double num = sc.nextInt();
		double tax = 0;
		
		if(num > 100000){
			tax = (num*15)/100;
			System.out.println("tax: "+tax);
		}else if(num <= 100000 && num >50000){
			tax = (num*10)/100;
			System.out.println("tax: "+tax);
		}else if(num <=50000 && num >= 0){
			tax = (num*5)/100;
			System.out.println("tax: "+tax);
		}
	}
}

