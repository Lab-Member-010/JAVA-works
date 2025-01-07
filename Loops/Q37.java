import java.util.Scanner;
class Q37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
		int i,rev=0,temp;
		temp=n;
        while (n>0) {
        	i = n%10;
		rev = rev*10 + i;
		n=n/10;
        }
        System.out.println(rev);
		if(rev==temp){
			System.out.print("Pallindrom");
		}else{
			System.out.print("Not Pallindrom");
		}
	}
}
