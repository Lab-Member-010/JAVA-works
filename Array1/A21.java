import java.util.Arrays;
import java.util.Scanner;
class A21{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+(i+1)+" :");
			arr[i] = scn.nextInt();
		}
        	Arrays.sort(arr);
        	int longestStart = 0;
        	int longestLength = 1;
        	int currentStart = 0;
        	int currentLength = 1;
        	for (int i = 1; i < arr.length; i++) {
                 	if (arr[i] == arr[i - 1] + 1) {
                		currentLength++;
            		} else if (arr[i] == arr[i - 1]) {
                		continue;
            		} else {
                		if (currentLength > longestLength) {
                	    		longestStart = currentStart;
                	    		longestLength = currentLength;
                		}
                		currentStart = i;
                		currentLength = 1;
            		}
        	}
        	if (currentLength > longestLength) {
            		longestStart = currentStart;
            		longestLength = currentLength;
        	}
        	System.out.print("Longest consecutive series: ");
        	for (int i = longestStart; i < longestStart + longestLength; i++) {
            		System.out.print(arr[i] + " ");
        	}
    	}
}
