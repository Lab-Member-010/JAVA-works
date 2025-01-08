import java.util.Arrays;
import java.util.Scanner;
class A23{
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the number of elements for the array: ");
	        int N = scanner.nextInt();
	        int[] array = new int[N];
        	System.out.println("Enter the elements for the array:");
        	for (int i = 0; i < N; i++) {
        		System.out.print("array[" + i + "] : ");
            		array[i] = scanner.nextInt();
        	}
        	System.out.print("\nEnter the number to find nearest lesser and greater elements: ");
        	int target = scanner.nextInt();
	        Arrays.sort(array);
        	int nearestLesser = findNearestLesser(array, target);
        	int nearestGreater = findNearestGreater(array, target);
        	System.out.println("\nOutput:");
        	if (nearestLesser != Integer.MIN_VALUE) {
        		System.out.println("Element lesser than " + target + " is : " + nearestLesser);
        	} else {
            		System.out.println("No element lesser than " + target + " found.");
        	}

	        if (nearestGreater != Integer.MAX_VALUE) {
                	System.out.println("Element greater than " + target + " is : " + nearestGreater);
        	} else {
                	System.out.println("No element greater than " + target + " found.");
        	}
    	}
    	private static int findNearestLesser(int[] array, int target) {
        	int index = Arrays.binarySearch(array, target);
        	if (index >= 0) {
        		return (index > 0) ? array[index - 1] : Integer.MIN_VALUE;
        	}
        	index = -index - 2;
        	return (index >= 0) ? array[index] : Integer.MIN_VALUE;
    	}
    	private static int findNearestGreater(int[] array, int target) {
        	int index = Arrays.binarySearch(array, target);
       		if (index >= 0) {
            		return (index < array.length - 1) ? array[index + 1] : Integer.MAX_VALUE;
        	}
        	index = -index - 1; 
        	return (index < array.length) ? array[index] : Integer.MAX_VALUE;
    	}
}

