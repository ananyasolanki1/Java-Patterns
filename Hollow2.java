public class Hollow2 {
    public static void main(String[] args) {
        
        // * * * * * * 
        // * *     * * 
        // *         * 
        // *         * 
        // * *     * * 
        // * * * * * *

        int n = 4;
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int c = n-1; c >= r; c--) {
                System.out.print("    ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            for (int c = n-1; c >= r; c--) {
                System.out.print("    ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // int size = 2 * n;

        // for (int row = 0; row < size; row++) {
        //     for (int col = 0; col < size; col++) {
        //         if (row < n) {
        //             if (col < (n - row) || col >= (n + row)) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         } else {
        //             if (col <= (row - n) || col >= (size - (row - n) - 1)) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
    }
}