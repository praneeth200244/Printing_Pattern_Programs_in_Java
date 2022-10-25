public class Pattern_11 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                if (i + j <= 10) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i=10; i>=1; i--) {
            for (int j=10; j>=i; j--) {
                System.out.print("  ");
            }
            for (int k=1; k<=(i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*

                  1
                1 1
              1 1 1
            1 1 1 1
          1 1 1 1 1
        1 1 1 1 1 1
      1 1 1 1 1 1 1
    1 1 1 1 1 1 1 1
  1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
  1 1 1 1 1 1 1 1 1
    1 1 1 1 1 1 1 1
      1 1 1 1 1 1 1
        1 1 1 1 1 1
          1 1 1 1 1
            1 1 1 1
              1 1 1
                1 1
                  1

 */
