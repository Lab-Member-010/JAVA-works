/*
    1
   11
  1*1
 1**1
11111 */
public class Pattern45 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print(1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
