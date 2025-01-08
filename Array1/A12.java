import java.util.Scanner;
class A12{
    public int countPairs(int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        A12 obj=new A12();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+" : ");
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter sum of pair: ");
        int k = scn.nextInt();
        int m = arr.length;
        System.out.println("Number of pairs with sum " + k + " in array1: " + obj.countPairs(arr, m, k));
    }
}
