public class HalfPyr {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****

        int r;  // row
        int c;  // column

        int n = 4;  // input

        for (r = 1; r <= n; r++) {
            for (c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
