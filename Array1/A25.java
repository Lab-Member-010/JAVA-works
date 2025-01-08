class A25{
	public static void main(String[] args) {
       		int[] numbers = {5, 10, 15, 20, 25};
	        System.out.println("Original Array:");
        	printArray(numbers);
		if (numbers.length >= 1) {
            		int temp = numbers[0];
            		numbers[0] = numbers[numbers.length - 1];
            		numbers[numbers.length - 1] = temp;
        	}
		System.out.println("\nArray after swapping first and last elements:");
        	printArray(numbers);
    	}
	public static void printArray(int[] arr) {
        	for (int num : arr) {
            		System.out.print(num + " ");
        	}
        	System.out.println();
    	}
}
