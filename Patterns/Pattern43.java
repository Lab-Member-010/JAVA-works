/*
    5
   44
  333
 2222
11111*/
public class Pattern43 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
