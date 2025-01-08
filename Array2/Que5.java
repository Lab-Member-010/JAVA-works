import java.util.Scanner;
class Que5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number to search:");
        int n=scn.nextInt();
        int arr[]={1,2,3,4,5};
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==n){
                break;
            }
        }
        System.out.println("value contain at index: "+i);
    }
}
