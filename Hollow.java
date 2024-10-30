public class Hollow {
    public static void main(String[] args) {
        // 4 x 5 (4 rows x 5 columns) outer x inner (i x j)

        for (int i=1; i<=4; i++) {
            for (int j=1; j<=5; j++) {
                if (i==1 || j==1 || i==4 || j==5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
