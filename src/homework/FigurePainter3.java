package homework;

import java.sql.SQLOutput;

public class FigurePainter3 {
    public static void main(String[] args) {
        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *          * * * *
         *            * * *
         *              * *
         *                *
         *
         * */

        for (int i = 4; i >=1; i--) {
            for (int j =i-1; j >= i; j--) {
                System.out.print(" ");}
                for (int k =1; k <=i; k++) {
                 System.out.print("*");
                }

            System.out.println(" ");
        }
    }}
