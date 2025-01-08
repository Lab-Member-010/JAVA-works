class A29{
	public static void main(String[] args) {
        	int[] AR = {1, 3, 5, 7, 9, 11, 13, 15};
        	int searchValue = 7;
	        int index = binarySearch(AR, searchValue);
        	if (index != -1) {
            		System.out.println("Element " + searchValue + " found at index " + index);
        	} else {
            		System.out.println("Element " + searchValue + " not found in the array");
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
