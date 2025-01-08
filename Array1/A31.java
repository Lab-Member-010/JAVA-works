import java.util.Arrays;
class A31{
    	public static void main(String[] args) {
        	int[] X = {9, 7, 5, 3, 1};
        	int[] Y = {8, 6, 4, 2};
        	int[] Z = mergeArraysDescending(X, Y);
        	System.out.println("Array X: " + Arrays.toString(X));
        	System.out.println("Array Y: " + Arrays.toString(Y));
        	System.out.println("Merged Array Z: " + Arrays.toString(Z));
    	}
    	public static int[] mergeArraysDescending(int[] X, int[] Y) {
        	int M = X.length;
        	int N = Y.length;
        	int[] Z = new int[M + N];
        	int i = 0, j = 0, k = 0;
		while (i < M && j < N) {
            		if (X[i] >= Y[j]) {
                		Z[k++] = X[i++];
            		} else {
                		Z[k++] = Y[j++];
            		}
        	}
        	while (i < M) {
            		Z[k++] = X[i++];
        	}
        	while (j < N) {
            		Z[k++] = Y[j++];
        	}
        	return Z;
    	}
}
