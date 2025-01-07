import java.util.Scanner;
class Q38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
	int i,sum=0,temp;
        temp=n;
        while (n>0) {
            	i=n%10;
		sum=sum+(i*i*i);
		n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
