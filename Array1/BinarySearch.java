import java.util.Scanner;
class BinarySearch{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
	        int n=scn.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	        	System.out.print("Enter element "+(i+1)+" :");	
	        	arr[i] = scn.nextInt();
	        }
	        System.out.print("Enter number to search: ");
        	int searchKey = scn.nextInt();
		int index = binarySearch(arr, searchKey);
	        if (index != -1) {
            		System.out.println("Element " + searchKey + " found at index " + index);
        	} else {
            		System.out.println("Element " + searchKey + " not found in the array");
        	}
    	}
	public static int binarySearch(int[] arr, int key) {
	        int left = 0;
        	int right = arr.length - 1;
        	while (left <= right) {
        	    int mid = left + (right - left) / 2;
        	    if (arr[mid] == key) {
        	        return mid;
        	    }
        	    if (arr[mid] < key) {
        	        left = mid + 1;
        	    } else {
        	        right = mid - 1;
        	    }
        	}
        	return -1;
    	}
}
