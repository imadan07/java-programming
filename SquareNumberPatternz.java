public class SquareNumberPatternz {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }


            for (int j = 1; j <= i; j++) {
                int square = num * num;
                System.out.print(square);


                if (j < i) {
                    System.out.print("   ");
                }

                num++;
            }

            System.out.println();
        }
    }
}
