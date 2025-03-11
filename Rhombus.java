public class Rhombus {
    public static void main(String[] args) {
        //         * * * * *  
        //       * * * * * 
        //     * * * * *
        //   * * * * *
        // * * * * *
        int k=4;
        for (int r=1; r<=5; r++) {
            for (int c=5; c>r; c--) {
                System.out.print(" " + " ");
            }
            for (int c=1; c<=r+k; c++) {
                System.out.print("*" + " ");
            }
            k--;
            System.out.println();
        }
    }
}
