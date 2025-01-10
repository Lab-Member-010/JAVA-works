import java.util.Scanner;
class Q25{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter buy Price: ");
		int price = sc.nextInt();
		
		System.out.println("Enter Sale Earn: ");
		int earn = sc.nextInt();
		
		if(price > earn){
			System.out.println("Profit:  "+(earn - price));
		}
		else if(price < earn){
			System.out.println("Loss:  "+(earn - price));
		}else {
		System.out.println("Equal");
		}
	}
}

