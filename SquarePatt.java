public class SquarePatt {
    public static void main(String[] args) {

        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 

        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
