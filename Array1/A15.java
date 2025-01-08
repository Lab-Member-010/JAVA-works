class A15{
    public static int findFirstNonRepeatingElement(int[] arr) {
        int[] count = new int[256];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1) {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 9, 6, 7, 4, 6};
        System.out.println("First non-repeating element is " + findFirstNonRepeatingElement(arr1));
    }
}
