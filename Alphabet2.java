public class Alphabet2 {
    public static void main(String[] args) {

        // A B C
        // A B
        // A
        
        int n = 6;

        for (int r = n; r >= 1; r--) {
            StringBuilder line = new StringBuilder();
            char ch = 'A';
            for (int c = 1; c <= r; c++) {
                line.append(ch).append(" "); 
                ch++;
            }
            System.out.println(line); // Prints the entire line at once
        }
    }
}
