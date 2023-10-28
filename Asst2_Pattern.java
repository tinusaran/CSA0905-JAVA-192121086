public class Asst2_Pattern {
    public static void main(String[] args) {
        int n = 4; // Change this value to adjust the size of the pattern
        // Print the top half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            // Print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        // Print the bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            // Print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
