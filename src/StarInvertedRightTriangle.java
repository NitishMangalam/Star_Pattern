public class StarInvertedRightTriangle {
    public static void main(String[] args) {
pattern3(5);
    }
    static void pattern3(int n) {
        // By using column decrement
//        for (int row = 1; row <=n ; row++) {
//            for (int col = n; col >=row ; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // By using column increment
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
