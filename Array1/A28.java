import java.util.Scanner;
class A28{
	public static void main(String[] args) {
        	Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+(i+1)+" :");
			arr[i] = scn.nextInt();
		}
		System.out.print("Enter element to find:");
        	int v = scn.nextInt();
        	boolean found = false;
        	for (int num : arr) {
            		if(num == v) {
                		found = true;
                		break;
            		}
        	}
        	if (found) {
            		System.out.println("Element found");
        	} else {
            		System.out.println("Element not found");
        	}
    	}
}

