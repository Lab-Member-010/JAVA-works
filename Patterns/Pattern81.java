class Pattern81 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i = i - 2) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
