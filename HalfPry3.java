public class HalfPry3 {
    public static void main(String[] args) {
        //     *
        //    **
        //   ***
        //  ****   

        for (int r=1; r<=4; r++) {
            for (int c=1; c<=4-r; c++) {
                System.out.print(" ");
            }
            for (int c=1; c<=r; c++) {      // loop2
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// if u remove loop2, u get-
//    *
//   * 
//  * 
// * 