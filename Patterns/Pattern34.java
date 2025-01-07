/*ABCDE
A  D
A C
AB
A */

public class Pattern34 {
    public static void main(String[] args) {
        char ch = 65;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
                ch++;
            }
            ch = 65;
            System.out.println();
        }

    }
}
