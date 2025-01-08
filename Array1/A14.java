class A14{
    public static int findFirstRepeatingElement(int[] arr) {
        int minIndex = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && j < minIndex) {
                    minIndex = j;
                }
            }
        }
        return arr[minIndex];
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 4, 5, 3, 6};
        System.out.println("First repeating element is " + findFirstRepeatingElement(arr1));
    }
}
