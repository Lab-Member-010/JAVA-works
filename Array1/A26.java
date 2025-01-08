class A26{
	public static void main(String[] args) {
        	int[] numbers = {5, 10, 15, 20, 25};
        	System.out.println("Original Array:");
	        printArray(numbers);
        	reverseArray(numbers);
        	System.out.println("\nArray after reversing elements:");
        	printArray(numbers);
    	}
	public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
			int temp = arr[start];
		        arr[start] = arr[end];
            		arr[end] = temp;
		        start++;
            		end--;
        	}
    	}
    	public static void printArray(int[] arr) {
        	for (int num : arr) {
            		System.out.print(num + " ");
        	}
        	System.out.println();
    	}
}
