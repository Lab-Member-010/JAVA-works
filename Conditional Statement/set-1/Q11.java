import java.util.Scanner;
class Q11{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the AGE: ");
		int age=scn.nextInt();
		
		System.out.println("Enter the SEX: ");
		char sex=scn.next().charAt(0);
		
		if(sex=='f' || sex=='F'){
			if(age>=20 && age<=60){
				System.out.println("work only in urban area");
			}else{
				System.out.println("ERROR");
			}
		}else if(sex=='m' || sex=='M'){
			if(age>=20 && age<40){
				System.out.println("work anywhere");			
			}else if(age>=40 && age<=60){
				System.out.println("work in urban area");			
			}else{
				System.out.println("ERROR");
			}
		}else{
				System.out.println("Enter correct gender");
		}
	}
}
