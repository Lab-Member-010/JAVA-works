class Pattern21 {
    public static void main(String[] args) {
        char ch = 97;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
