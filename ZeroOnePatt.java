public class ZeroOnePatt {
    public static void main(String[] args) {
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int n = 4;
        for (int r = 1; r <= n; r++) {
            for (int c = r; c >= 1; c--) {
                System.out.print(c % 2 + " ");
            }
            System.out.println();
        }

    //     for (int r=1; r<=5; r++) {
    //         for (int c=1; c<=r; c++) {
    //             if ((r+c) % 2 == 0) {
    //                 System.out.print(1 + " ");
    //             }
    //             else {
    //                 System.out.print(0 + " ");
    //             }
    //         }
    //         System.out.println();
    //     }
    }
}
