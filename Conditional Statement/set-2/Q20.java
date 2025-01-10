import java.util.Scanner;
class Q20{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter char");
		char a = sc.next().charAt(0);
		
		if(a>='a' && a>='Z'){
			System.out.println("Alphabet");
		}else{
			System.out.println("not an Alphabet");
		}
	}
}
