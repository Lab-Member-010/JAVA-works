/*
    A
   AB
  A_C
 A__D
ABCDE */

public class Pattern46 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 1; i <= 5; i++) {
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
