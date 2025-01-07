import java.util.Scanner;
class Q42 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int n1=scn.nextInt();
        System.out.println("Enter Number 2: ");
        int n2=scn.nextInt();
        int i=1,hcf=1                                                                                                                                        ;
        while (i<=n1 && i<=n2) {
            if (n1%i==0 && n2%i==0) {
                hcf=i;
            }
            i++;
        }
        System.out.println("HCF: "+hcf);
    }
}
