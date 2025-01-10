import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Age:");
        int a=scn.nextInt();
        if(a<0){
            a=~a;
            System.out.println("Value: "+(++a));
        }else{
            System.out.println("value: "+a);
        }
        
    }
}
