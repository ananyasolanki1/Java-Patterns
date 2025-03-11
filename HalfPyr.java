public class HalfPyr {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****

        int r;  // row
        int c;  // column

        for (r=1; r<=4; r++) {
            for (c=1; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
