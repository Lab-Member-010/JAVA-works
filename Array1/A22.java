class A22{
	public static void main(String[] args) {
	        int[] arr = {8, 3, 1, 2};
        	int n = arr.length;
		int maxSum = getMaxSumConfiguration(arr,n);
	        System.out.println("Max sum after any rotation: " + maxSum);
    	}
	public static int getMaxSumConfiguration(int[] arr, int n) {
	        int totalSum = 0;
        	int currentSum = 0;
		for (int i = 0; i < n; i++) {
            		totalSum += arr[i];
            		currentSum += i * arr[i];
        	}
        	int maxSum = currentSum;
        	for(int i = 1; i < n; i++) {
            		currentSum = currentSum + totalSum - n * arr[n - i];
            		if (currentSum > maxSum) {
                		maxSum = currentSum;
            		}
        	}
        	return maxSum;
    	}
}
