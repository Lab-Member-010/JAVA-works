class A27{
	public static void main(String[] args) {
		int[] numbers = {5, 10, 3, 8, 15, 1, 20, 7};
	        int largest = numbers[0];
	        int smallest = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	        	if (numbers[i] > largest) {
                		largest = numbers[i];
            		} else if (numbers[i] < smallest) {
                		smallest = numbers[i];
            		}
        	}
        	System.out.println("Array: ");
        	printArray(numbers);
        	System.out.println("\nLargest element: " + largest);
        	System.out.println("Smallest element: " + smallest);
    	}
    	public static void printArray(int[] arr) {
        	for (int num : arr) {
            		System.out.print(num + " ");
        	}
    	}
}

