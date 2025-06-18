public class ReverseOddStarPyramid {
    public static void main(String[] args) {
patternReversePyramid7(7);
    }
    static void patternReversePyramid7(int n) {
        for (int row = 1; row <= n; row++) {

            // Step 1: Print spaces to push stars to the right
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            // Step 2: Print stars in odd decreasing order
            int totalStars = 2 * (n - row + 1) - 1;
            for (int col = 1; col <= totalStars; col++) {
                System.out.print("*");
            }

            // Step 3: Move to next line
            System.out.println();
        }
    }
}
