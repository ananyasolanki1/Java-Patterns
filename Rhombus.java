public class Rhombus {
    public static void main(String[] args) {
        
    //         * * * * 
    //       * * * * 
    //     * * * * 
    //   * * * * 
    // * * * * 

        int k = 3; // width
        int n = 5; // height
        for (int r = 1; r <= n; r++) {
            for (int c = 5; c > r; c--) {
                System.out.print("  ");
            }
            for (int c = 1; c <= r+k; c++) {
                System.out.print("* ");
            }
            k--;
            System.out.println();
        }
    }
}
