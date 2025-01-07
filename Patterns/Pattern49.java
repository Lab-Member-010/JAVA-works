/*55555
  4444
   333
    22
     1 */

public class Pattern49 {
    public static void main(String[] args) {
	int i=0,j=0;
        for ( i = 5; i >= 1; i--) {

            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
