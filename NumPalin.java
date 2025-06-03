public class NumPalin {
    public static void main(String[] args) {
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        int n = 5;
        
        for (int r = 1; r <= n; r++) {          // I did this all by A HELL LOT OF trial and error
            for (int c = n-1; c >= r; c--) {
                System.out.print("  ");
            }
            for (int c = 0; c < r; c++) {
                System.out.print(r - c + " ");
            }
            for (int c = n-2; c <= (r + 1); c++) {
                System.out.print(c-1 + " ");
            }
            System.out.println();
        }

        // for (int r = 1; r <= n; r++) {                   // prints * triangle. try it
        //     for (int c = n - 1; c >= r; c--) {
        //         System.out.print("  ");
        //     }
        //     for (int c = 1; c <= r; c++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
