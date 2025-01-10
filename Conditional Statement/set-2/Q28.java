import java.util.Scanner;
class Q28{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Unit");
		double unit = sc.nextInt();
		double subcharge;
		if(unit >= 250){
			subcharge=((unit*1.50)*20)/100;
			System.out.println("10/Par Unit  "+((unit * 1.50)+subcharge));
		}
		else if(unit >= 100){
			System.out.println("7/Par Unit  "+(unit * 1.20));
		}
		else if(unit >= 50){
			System.out.println("5/Par Unit  "+(unit * 0.75));
		}
		else if(unit >= 0){
			System.out.println("2/Par Unit  "+(unit * 0.50));
		}
	}
}
