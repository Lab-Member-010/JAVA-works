/*
*
**
****
*******
*********** 
*/

public class Pattern38 {
    public static void main(String[] args) {
        int k = 0;
        int a = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i + k; j++) {

                System.out.print("*");
                a = i;

            }
            k = a;
            System.out.println();
        }

    }
}
