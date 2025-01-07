import java.util.Scanner;
class Q39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        int temp=n;
        int i,fact,j,sum=0;
        while (n>0) {
            i=n%10;
            fact=1;
            j=1;
            while(j<=i){
                fact=fact*j;
                j++;
            }
            System.out.println("fact: "+fact);
           sum=sum+fact;
           n=n/10;
        }
        System.out.println("sum: "+sum);
        if(sum==temp){
            System.out.println("Strong");
        }else{
            System.out.println("Not Strong");
        }  
    }
}

