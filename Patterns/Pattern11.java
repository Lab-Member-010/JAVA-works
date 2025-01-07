class Pattern11 {
    public static void main(String[] args) {
        char ch = 97;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch = 97;
            System.out.println();
        }
    }
}
