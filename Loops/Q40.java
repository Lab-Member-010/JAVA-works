import java.util.Scanner;
class Q40 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=scn.nextInt();
        int d1=0,d2=0,i;
        while(n>0){
            i=n%10;
            if(i%2==0){
                d1++;
            }else{
                d2++;
            }
            n=n/10;
        }
        System.out.println("Even Digits: "+d1);
        System.out.println("Odd Digits:"+d2);
    }
}

