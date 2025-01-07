class Pattern79 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(j);
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }

        for (int i = 3; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                if (i == k || k == 5 || k == 1) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
