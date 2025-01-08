class A13{
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int minLength = Math.min(m, n);
        int[] intersection = new int[minLength];
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
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    intersection[k++] = arr1[i++];
                    j++;
                }
            }
        }
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = intersection[x];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of the two sorted arrays:");
        printArray(intersection);
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
