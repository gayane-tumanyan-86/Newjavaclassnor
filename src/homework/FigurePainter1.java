package homework;

public class FigurePainter1 {
    public static void main(String[] args) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *                      *
         *                    * *
         *                  * * *
         *                * * * *
         *
         **/

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {

                System.out.print(" ");
            }
            for (int  j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}