public class Hollow {
    public static void main(String[] args) {
        // 4 x 5 (4 rows x 5 columns) outer x inner (i x j)

        int rows = 4;
        int columns = 9;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
