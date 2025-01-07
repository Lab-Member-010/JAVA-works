class Pattern75 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i = i - 2) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 9 || j == 1) {
                    System.out.print(" " + j);
                } else {
                    System.out.print(" +");
                }

            }
            System.out.println();
        }
    }
}
