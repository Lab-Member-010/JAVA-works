import java.util.Arrays;
class A30{
    	public static void main(String[] args) {
        	int[] A = {1, 3, 5, 7, 9};
        	int[] B = {10, 8, 6, 4, 2};
	        int[] C = mergeArrays(A, B);
	        System.out.println("Array A: " + Arrays.toString(A));
        	System.out.println("Array B: " + Arrays.toString(B));
	        System.out.println("Merged Array C: " + Arrays.toString(C));
    	}
    	public static int[] mergeArrays(int[] A, int[] B) {
        	int M = A.length;
        	int N = B.length;
        	int[] C = new int[M + N];
	        int i = 0, j = N - 1, k = 0;
		while (i < M && j >= 0) {
            		if (A[i] <= B[j]) {
                		C[k++] = A[i++];
            		} else {
                		C[k++] = B[j--];
            		}
        	}
        	while (i < M) {
            		C[k++] = A[i++];
        	}
        	while (j >= 0) {
            		C[k++] = B[j--];
        	}
        	return C;
    	}
}

