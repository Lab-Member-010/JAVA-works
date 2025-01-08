import java.util.Scanner;
class A24{
    	public static void main(String[] args) {
        	Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+(i+1)+" :");
			arr[i] = scn.nextInt();
		}
        	int sum = 0;
        	for (int number : arr) {
        		sum += number;
        	}
        	double average = (double) sum / arr.length;
        	System.out.println("Sum: " + sum);
        	System.out.println("Average: " + average);
    	}
}
