class A17{
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int positiveCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveCount++;
            }
        }
        int[] positives = new int[positiveCount];
        int[] negatives = new int[n - positiveCount];
        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positives[posIndex++] = arr[i];
            } else {
                negatives[negIndex++] = arr[i];
            }
        }
        int i = 0, j = 0, k = 0;
        boolean startWithPositive = true;
        while (i < positives.length && j < negatives.length) {
            if (startWithPositive) {
                arr[k++] = positives[i++];
            } else {
                arr[k++] = negatives[j++];
            }
            startWithPositive = !startWithPositive;
        }
        while (i < positives.length) {
            arr[k++] = positives[i++];
        }
        while (j < negatives.length) {
            arr[k++] = negatives[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
