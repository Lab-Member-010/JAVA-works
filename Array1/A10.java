class A10{
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int totalLength = m + n;
        int[] union = new int[totalLength];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) {
                i++;
            }
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    union[k++] = arr1[i++];
                } else if (arr1[i] > arr2[j]) {
                    union[k++] = arr2[j++];
                } else {
                    union[k++] = arr1[i++];
                    j++;
                }
            }
        }
        while (i < m) {
            union[k++] = arr1[i++];
        }
        while (j < n) {
            union[k++] = arr2[j++];
        }
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = union[x];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] union = findUnion(arr1, arr2);
        System.out.println("Union of the two sorted arrays:");
        printArray(union);
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
