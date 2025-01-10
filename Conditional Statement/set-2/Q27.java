import java.util.Scanner;
class Q27 {
	public static void main (String args []){
		Scanner scn
		 = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int salary=scn.nextInt();
		
		if(salary>20000){
			salary+=((salary*30/100)+(salary*95/100));
			System.out.println(""+salary);
		}else if(salary<=20000 && salary>10000){
			salary+=((salary*25/100)+(salary*90/100));
			System.out.println(""+salary);
		}else if(salary<=10000 && salary>=0){
			salary+=((salary*20/100)+(salary*80/100));
			System.out.println(""+salary);
		}else{
			System.out.println("Error");
		}
	}
}
