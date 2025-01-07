/*ABCDE
  A__D
   A_C
    AB
     A */

public class Pattern52 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 5; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(ch);
                } else {
                    System.out.print("_");
                }
                ch++;
            }
            ch = 65;
            System.out.println();
        }
    }
}
