import java.util.Scanner;
class Q32{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		char i='a';
		char j='A';
		char k=1;
		while(k<=26){
			if(k%2==0){
				System.out.print(i+" ");
			}	
			if(k%2!=0){
				System.out.print(j+" ");
			}	
			i++;
			j++;
			k++;
		}	
	}
}
