public class Pattern_4 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;

        for (i=1; i<=5; i++) {
            for (j=i; j<5; j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (i=1; i<=5; i++) {
            for (j=i; j<5; j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (i=1; i<=5; i++) {
            for (j=i; j<5; j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("\n");


        for (i=1; i<=5; i++) {
            for (j=1; j<=5; j++) {
                if (i + j <= 5) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (i=1; i<=10; i++) {
            for (int space=1; space<=(10-i); space++) {
                System.out.print(" ");
            }
            for (int star=1; star<=i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*
    1
   22
  333
 4444
55555
 */