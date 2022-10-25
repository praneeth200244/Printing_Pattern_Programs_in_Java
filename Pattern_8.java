public class Pattern_8 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=5-1; i>=1; i--) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=5; i++) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i=5-1; i>=1; i--) {
            for (int space=1; space<=(5-i); space++) {
                System.out.print("  ");
            }
            for (int star=1; star<=(2*i-1); star++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
/*
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
  4 4 4 4 4 4 4
    3 3 3 3 3
      2 2 2
        1
 */