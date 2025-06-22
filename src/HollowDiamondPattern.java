public class HollowDiamondPattern {
    public static void main(String[] args) {
        patternHollowDiamond(7);
    }

    static void patternHollowDiamond(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");

                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        for (int row = n - 1; row >= 1; row--) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");

                for (int space = 1; space <= 2 * row - 3; space++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }
    }
}
