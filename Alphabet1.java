public class Alphabet1 {
    public static void main(String[] args) {

        // A
        // A B
        // A B C
        
        int n = 6;
        // char ch;
        // for (int r = 1; r <= n; r++) {
        //     ch = 'A';
        //     for (int c = 1; c <= r; c++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        for (int r = 1; r <= n; r++) {
            StringBuilder line = new StringBuilder();
            char ch = 'A';
            for (int c = 1; c <= r; c++) {
                line.append(ch).append(" "); // Efficiently builds the string
                ch++;
            }
            System.out.println(line); // Prints the entire line at once
        }
    }
}
