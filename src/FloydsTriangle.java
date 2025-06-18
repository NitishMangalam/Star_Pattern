public class FloydsTriangle {
    public static void main(String[] args) {
        floydPattern(7);
    }
    static void floydPattern(int n) {
        int number = 1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(number+" ");
                number+=2;
            }
            System.out.println();
        }
    }
}
