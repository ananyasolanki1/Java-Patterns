public class NumPatt3 {
    public static void main(String[] args) {

        // 1      1
        // 12    21
        // 123  321
        // 12344321

        int n = 4;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            // System.out.println();
            for (int c = 2*(n-r); c >= 1; c--) {
                System.out.print(" ");
            }
            // for (int c = n-1; c >= r; c--) {
            //     System.out.print(" ");
            // }
            for (int c = r; c >= 1; c--) {
                System.out.print(c);
            } 
            System.out.println();
        }
    }
}
